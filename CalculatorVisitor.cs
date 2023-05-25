using System.Globalization;
using System.Text.RegularExpressions;
using static btic_lab_1_alt.CalculatorParser;

namespace btic_lab_1_alt
{
    public class CalculatorVisitor : CalculatorBaseVisitor<double>
    {
        static Dictionary<string, double> variable = new();

        public override double VisitEquation(EquationContext context)
        {
            if (context.ASSIGN() != null)
            {
                var id = context.variable().GetText();  // id is left-hand side of '='
                var value = Visit(context.expression(0));   // compute value of expression on right


                if(variable.ContainsKey(id)) {
                    variable[id] = value;
                }
                else
                {
                    variable.Add(id, value);
                }

                return value;
            }

            if (context.relop() != null)
            {
                if (context.relop().LT() != null)
                {
                    if (Visit(context.expression(0)) < Visit(context.expression(1)))
                        return 1;
                    if (Visit(context.expression(0)) > Visit(context.expression(1)))
                        return -1;
                    return 0;
                }

                if (context.relop().GT() != null)
                {
                    if (Visit(context.expression(0)) > Visit(context.expression(1)))
                        return 1;
                    if (Visit(context.expression(0)) < Visit(context.expression(1)))
                        return -1;
                    return 0;
                }

                if (context.relop().EQ() != null)
                {
                    if (Visit(context.expression(0)) == Visit(context.expression(1)))
                        return 1;
                    else
                        return -1;
                }
            }
            
            var d0 = context.expression(0);
            var res = Visit(d0);

            return res;
        }

        public override double VisitSqrt(SqrtContext context)
        {
            return Math.Sqrt(Visit(context.expression()));
        }

        public override double VisitSin(SinContext context)
        {
            return Math.Sin(Visit(context.expression()));
        }

        public override double VisitCos(CosContext context)
        {
            return Math.Cos(Visit(context.expression()));
        }

        public override double VisitTan(TanContext context)
        {
            return Math.Tan(Visit(context.expression()));
        }

        public override double VisitLog(LogContext context)
        {
            return Math.Log(Visit(context.expression()));
        }

        public override double VisitDefault(DefaultContext context)
        {
            var multiplyingExpressionContext = context.multiplyingExpression();
            var d0 = context.multiplyingExpression(0);
            var res = Visit(d0);

            if (multiplyingExpressionContext.Count() == 1)
                return res;

            for (int i = 1; i < multiplyingExpressionContext.Count(); i++)
            {
                var di = context.multiplyingExpression(i);
                res = (context.PLUS(i - 1) != null) ? res + Visit(di) : res - Visit(di);
            }

            return res;
        }

        public override double VisitMultiplyingExpression(MultiplyingExpressionContext context)
        {
            var powExpressionContext = context.powExpression();
            var d0 = context.powExpression(0);
            var res = Visit(d0);

            if (powExpressionContext.Count() == 1)
                return res;

            for (int i = 1; i < powExpressionContext.Count(); i++)
            {
                var di = context.powExpression(i);
                res = (context.DIV(i - 1) != null) ? res / Visit(di) : res * Visit(di);
            }

            return res;
        }

        public override double VisitPowExpression(PowExpressionContext context)
        {
            var signedAtomContext = context.signedAtom();
            var d0 = context.signedAtom(0);
            var res = Visit(d0);

            if (signedAtomContext.Count() == 1)
                return res;

            for (int i = 1; i < signedAtomContext.Count(); i++)
            {
                var di = context.signedAtom(i);
                res = Math.Pow(res, Visit(di));
            }

            return res;
        }

        public override double VisitSignedAtom(SignedAtomContext context)
        {
            if (context.PLUS() != null)
            {
                return Visit(context.signedAtom());
            }
            if (context.MINUS() != null)
            {
                return -1 * Visit(context.signedAtom());
            }
            if (context.func_() != null)
            {
                return Visit(context.func_());
            }

            return Visit(context.atom());
        }

        public override double VisitAtom(AtomContext context)
        {
            if (context.number() != null)
            {
                return Visit(context.number());
            }
            if (context.variable() != null)
            {
                return Visit(context.variable());
            }

            return Visit(context.expression());
        }

        public override double VisitNumber(NumberContext context)
        {
            if (context.binary() != null)
            {
                return Visit(context.binary());
            }
            if (context.octal() != null)
            {
                return Visit(context.octal());
            }
            if (context.hex() != null)
            {
                return Visit(context.hex());
            }
            if (context.@decimal() != null)
            {
                return Visit(context.@decimal());
            }

            throw new ArgumentException("Invalid value");
        }

        public override double VisitDecimal(DecimalContext context)
        {
            Regex regex = new Regex(@"(?<p1>[0]|[1-9][0-9]*)(?<p2>[.][0-9]+)?(?<p3>[eE][+-]?[0-9]+)?");
            var number = context.GetText().ToLower();
            var match = regex.Match(number);

            //return Convert.ToDouble(match.Groups["p1"].Value+ match.Groups["p2"].Value);
            double.TryParse(number, NumberStyles.Float, CultureInfo.InvariantCulture, out var res);
            return res;
        }

        public override double VisitBinary(BinaryContext context)
        {
            Regex regex = new Regex(@"(?<i>0b)(?<p1>[0]|[1][0-1]*)(?<p2>[.][0-1]+)?(?<p3>[eE][+-]?[1][0-1]*)?");
            var number = context.GetText().ToLower();
            var match = regex.Match(number);
            var res = 0.0;

            if (match.Groups["p1"].Success)
                res += Convert.ToInt32(match.Groups["p1"].Value, 2);
            if (match.Groups["p2"].Success)
            {
                var num = Convert.ToInt32(match.Groups["p2"].Value.Remove(0, 1), 2);
                res += num / Math.Pow(2, num.ToString().Count());
            }

            if (match.Groups["p3"].Success)
            {
                var mantissa = match.Groups["p3"].Value.Remove(0, 1);

                if (mantissa[0] == '-')
                {
                    res /= Math.Pow(2, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 2), 2));
                    return res;
                }
                if (mantissa[0] == '+')
                {
                    res *= Math.Pow(2, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 2), 2));
                    return res;
                }
                else
                {
                    res *= Math.Pow(2, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 1), 2));
                    return res;
                }
            }

            return res;
        }

        public override double VisitOctal(OctalContext context)
        {
            Regex regex = new Regex(@"(?<i>0o)(?<p1>[0]|[1-7][0-7]*)(?<p2>[.][0-7]+)?(?<p3>[eE][+-]?[1-7][0-7]*)?");
            var number = context.GetText().ToLower();
            var match = regex.Match(number);
            var res = 0.0;

            if (match.Groups["p1"].Success)
                res += Convert.ToInt32(match.Groups["p1"].Value, 8);
            if (match.Groups["p2"].Success)
            {
                var num = Convert.ToInt32(match.Groups["p2"].Value.Remove(0, 1), 8);
                res += num / Math.Pow(8, num.ToString().Count());
            }

            if (match.Groups["p3"].Success)
            {
                var mantissa = match.Groups["p3"].Value.Remove(0, 1);

                if (mantissa[0] == '-')
                {
                    res /= Math.Pow(8, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 2), 8));
                    return res;
                }
                if (mantissa[0] == '+')
                {
                    res *= Math.Pow(8, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 2), 8));
                    return res;
                }
                else
                {
                    res *= Math.Pow(8, Convert.ToInt32(match.Groups["p3"].Value.Remove(0, 1), 8));
                    return res;
                }
            }

            return res;
        }

        public override double VisitHex(HexContext context)
        {
            Regex regex = new Regex(@"(?<i>0h)(?<p1>[0]|[1-9a-fA-F][0-9a-fA-F]*)(?<p2>[.][0-9a-fA-F]+)?(?<p3>[mM][+-]?[0-9a-fA-F]+)?");
            var number = context.GetText().ToLower();
            var match = regex.Match(number);
            var res = 0.0;

            if (int.TryParse(match.Groups["p1"].Value, NumberStyles.HexNumber, CultureInfo.InvariantCulture, out var p1))
                res += p1;
            if (match.Groups["p2"].Success && int.TryParse(match.Groups["p2"].Value.Remove(0, 1), NumberStyles.HexNumber, CultureInfo.InvariantCulture, out var p2))
                res += p2 / Math.Pow(16, match.Groups["p2"].Value.Remove(0, 1).Count());

            if (match.Groups["p3"].Success)
            {
                var mantissa = match.Groups["p3"].Value.Remove(0, 1);

                if (mantissa[0] == '-')
                {
                    if (int.TryParse(match.Groups["p3"].Value.Remove(0, 2), NumberStyles.HexNumber, CultureInfo.InvariantCulture, out var p3))
                    {
                        res /= Math.Pow(16, p3);
                        return res;
                    }
                }
                if (mantissa[0] == '+')
                {
                    if (int.TryParse(match.Groups["p3"].Value.Remove(0, 2), NumberStyles.HexNumber, CultureInfo.InvariantCulture, out var p3))
                    {
                        res *= Math.Pow(16, p3);
                        return res;
                    }
                }
                else if (int.TryParse(match.Groups["p3"].Value.Remove(0, 1), NumberStyles.HexNumber, CultureInfo.InvariantCulture, out var p3))
                {
                    res *= Math.Pow(16, p3);
                    return res;
                }
            }

            return res;
        }

        public override double VisitVariable(VariableContext context)
        {
            var key = context.VAR().GetText();
            if (variable.ContainsKey(key))
                return variable[key];
            else
                return 0.0;

        }

        public override double VisitFunc_(Func_Context context)
        {
            var type = context.GetText();

            switch (type)
            {
                case "cos":
                    return Math.Cos(Visit(context.expression(0)));
                case "tan":
                    return Math.Tan(Visit(context.expression(0)));
                case "sin":
                    return Math.Sin(Visit(context.expression(0)));
                case "acos":
                    return Math.Acos(Visit(context.expression(0)));
                case "atan":
                    return Math.Atan(Visit(context.expression(0)));
                case "asin":
                    return Math.Asin(Visit(context.expression(0)));
                case "log":
                    return Math.Log(Visit(context.expression(0)));
                case "sqrt":
                    return Math.Sqrt(Visit(context.expression(0)));
            }

            return Visit(context.expression(0));

        }
    }
}
