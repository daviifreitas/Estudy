using System;

namespace ConsoleApplication01.Laboratory.getAndSet
{
    public class Program
    {
         private static void Min(string[] args)
        {
            Computer c = new Computer();

            c.Brand = "Sansung";
            Console.WriteLine("A marca do seu computador é : "+c.Brand);
        }
    }
}