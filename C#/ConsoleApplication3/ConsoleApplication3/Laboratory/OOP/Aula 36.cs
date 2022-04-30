using System;

namespace ConsoleApplication01.OOP
{
    class Veiculo
    {
        public int velAtual;
        private int velMax;
        protected bool ligado;

        public Veiculo(int velMax)
        {
            velAtual = 0;
            this.velMax = velMax;
            ligado = false;
        }

        public int getVelMax()
        {
            return this.velMax;
        }
    }

    class Carro : Veiculo
    {
        public string nome;

        public Carro(string nome, int velMax) : base(velMax)
        {
            this.nome = nome;
            ligado = true;
        }

        public bool getLigado()
        {
            return ligado;
        }
        
    }
    public class Aula_36
    {
        public static void ain(string[] args)
        {
            Carro carro = new Carro("Bonitão", 120);
            Console.WriteLine($"O nome do carro : {carro.nome}\nVelocidade máxima {carro.getVelMax()}" +
                              $"\nLigado ? {carro.getLigado()}");
        }
    }
}