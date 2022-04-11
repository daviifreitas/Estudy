using System;

namespace ConsoleApplication01.OOP
{
    public class Aula_37
    {
        public static void Main(string[] args)
        {
            Derivada2 derivada2 = new Derivada2();
            
        }
    }

    class Base
    {
        public Base()
        {
            Console.WriteLine("Construtor da classe base !!!");
        }
    }

    class Derivada1 : Base
    {
        public Derivada1()
        {
            Console.WriteLine("Construtor da classe derivada1");
        }
    }

    class Derivada2 : Derivada1
    {
        public Derivada2()
        {
            Console.WriteLine("Construtor da classe derivada2");
        }
    }
}