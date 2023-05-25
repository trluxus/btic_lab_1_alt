// See https://aka.ms/new-console-template for more information
using btic_lab_1_alt;


while (true)
{
    try
    {
        var res = Calculator.Evaluate(Console.ReadLine());

        if (res != null)
            Console.WriteLine(res);
    }
    catch (ArgumentException e)
    {
        Console.WriteLine(e.Message);
    }
}