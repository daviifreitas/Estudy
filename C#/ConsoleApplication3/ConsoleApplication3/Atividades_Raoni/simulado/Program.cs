using System;

namespace ConsoleApplication3.Atividades_Raoni.simulado
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Person p = new Person("Davi Freitas", 16);
            p.fazerAniversario();
            p.fazerAniversario();

            Console.WriteLine($"A pessoa {p.Name} tem {p.Idade}");
        }
    }
}