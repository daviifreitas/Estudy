using System;

namespace ConsoleApplication01.OOP
{
    public class Aula32
    {
        public static void ain(string[] args)
        {
            Calculos c = new Calculos(10, 2);

            Console.WriteLine("O resultado da soma dos valores é : "+c.Somar());
        }
    }

    class Calculos
    {
        public int v2;
        public int v1;

        public Calculos(int v1, int v2)
        {
            this.v1 = v1;
            this.v2 = v2;
        }
        
        public int Somar()
        {
            return v1 + v2;
        }
    }
}