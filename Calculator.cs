using Antlr4.Runtime;

namespace btic_lab_1_alt
{
    public static class Calculator
    {
        public static double Evaluate(string expression)
        {
            var lexer = new CalculatorLexer(new AntlrInputStream(expression));
            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(new ThrowExceptionErrorListener());

            var tokens = new CommonTokenStream(lexer);

            var parser = new CalculatorParser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new ThrowExceptionErrorListener());
 
            var tree = parser.equation();

            var visitor = new CalculatorVisitor();

            return visitor.Visit(tree);
        }
    }
}
