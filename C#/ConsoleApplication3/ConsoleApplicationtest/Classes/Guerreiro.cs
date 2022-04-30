using System;

namespace ConsoleApplicationtest.Classes
{
    public class Guerreiro : Pessoa
    {
        private string nomeDaEspada;
        private int danoDaEspada;
        private int nivelDaEspada;
        private int nivelDaArmadura;
        
        public Guerreiro(string name, int idade, int mana, int dano, int podeDeHabilidade,
            int vida, int level , string nomeDaEspada ,int nivelDaEspada  , int danoDaEspada , int nivelDaArmadura) : base(name, idade, mana, dano, podeDeHabilidade, vida, level)
        {
            NomeDaEspada = nomeDaEspada;
            NivelDaEspada = nivelDaEspada;
            DanoDaEspada = danoDaEspada;
            NivelDaArmadura = nivelDaArmadura;
        }

        ~Guerreiro()
        {
            Console.WriteLine("O guerreiro {Name} está sendo deletado !!!!!!");
        }

        public string NomeDaEspada
        {
            get => nomeDaEspada;
            set => nomeDaEspada = value;
        }

        public int DanoDaEspada
        {
            set => danoDaEspada = value;
            get => danoDaEspada;
        }

        public int NivelDaEspada
        {
            set => nivelDaEspada = value;
            get => nivelDaEspada;
        }

        public int NivelDaArmadura
        {
            set => nivelDaArmadura = value;
            get => nivelDaArmadura;
        }

        public override void levelup()
        {
            Level = Level + 1;
            Dano = Dano + 50;
            PodeDeHabilidade = PodeDeHabilidade + 10;
            Vida = Vida + 300;
            Mana = Mana + 120;
        }

        public override void ganharDano()
        {
            Dano = Dano + 50;
        }

        public override void ganharPoderDeHabilidade()
        {
            PodeDeHabilidade = PodeDeHabilidade + 15;
        }

        public override void ganharVida()
        {
            Vida = Vida + 150;
        }

        public override void ganharMana()
        {
            Mana = Mana + 75;
        }
    }
}