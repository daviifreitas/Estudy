using System;
using HerancaePolimorfismo.Classes;

namespace HerancaePolimorfismo
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Guerreiro g1 = new Guerreiro("Josinaldo");
            g1.subirDeNivel();
            g1.receberDano();
            g1.ganharBuff();
            g1.status();
        }
    }
}