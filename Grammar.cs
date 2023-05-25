using Antlr4.Runtime.Tree.Xpath;
using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace btic_lab_1_alt
{
    public static class Grammar
    {
        public static double Evaluate(string expression)
        {
            var lexer = new GrammarLexer(new AntlrInputStream(expression));
            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(new ThrowExceptionErrorListener());

            var tokens = new CommonTokenStream(lexer);

            var parser = new GrammarParser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new ThrowExceptionErrorListener());

            var tree = parser.compileUnit();

            var visitor = new Visitor();

            return visitor.Visit(tree);
        }
    }
}
