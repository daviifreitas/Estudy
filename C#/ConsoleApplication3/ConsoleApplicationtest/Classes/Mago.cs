using System;

namespace ConsoleApplicationtest.Classes
{
    public class Mago : Pessoa
    {
        private string nomeDaHabilidade;
        private string nomeCajado;

        public Mago(string name, int idade, int mana, int dano, int podeDeHabilidade, int vida, int level,
            string nomeDaHabilidade, string nomeCajado) : base(name, idade, mana, dano, podeDeHabilidade, vida, level)
        {
            this.nomeDaHabilidade = nomeDaHabilidade ?? throw new ArgumentNullException(nameof(nomeDaHabilidade));
            this.nomeCajado = nomeCajado ?? throw new ArgumentNullException(nameof(nomeCajado));
        }

        public string NomeDaHabilidade
        {
            set => nomeDaHabilidade = value;
            get => nomeDaHabilidade;
        }

        public string NomeCajado
        {
            set => nomeCajado = value ;
            get => nomeCajado;
        }

        public override void levelup()
        {
            Level = Level + 1;
            Dano = Dano + 25;
            PodeDeHabilidade = PodeDeHabilidade + 50;
            Vida = Vida + 120;
            Mana = Mana + 200;
            
        }

        public override void ganharDano()
        {
            Dano = Dano + 15;
        }

        public override void ganharPoderDeHabilidade()
        {
            PodeDeHabilidade = PodeDeHabilidade + 25;
        }

        public override void ganharVida()
        {
            Vida = Vida + 100; 
        }

        public override void ganharMana()
        {
            Mana = Mana + 150;
        }
    }
}