using ConsoleApplicationtest.Interfaces;

namespace ConsoleApplicationtest.Classes
{
    public class Pessoa : Acoes
    {
        protected string name;
        protected int idade;
        protected int vida;
        protected int mana;
        protected int dano;
        protected int podeDeHabilidade;
        protected int level;

        public Pessoa(string name , int idade , int mana , int dano , int podeDeHabilidade, int vida , int level  )
        {
            Vida = vida;
            Name = name;
            Idade = idade;
            Mana = mana;
            Dano = dano;
            PodeDeHabilidade = podeDeHabilidade;
            Level = level;
        }

        public int Level
        {
            set => level = value;
            get => level;
        }

        public string Name
        {
            set => name = value;
            get => name;
        }

        public int Idade
        {
            set => idade = value;
            get => idade; 
        }

        public int Vida
        {
            set => vida = value;
            get => vida;
        }

        public int Mana
        {
            set => mana = value;
            get => mana;
        }

        public int Dano
        {
            set => dano = value;
            get => dano;
        }

        public int PodeDeHabilidade
        {
            set => podeDeHabilidade = value;
            get => podeDeHabilidade;
        }

        public virtual void levelup()
        {
            throw new System.NotImplementedException();
        }

        public virtual void ganharDano()
        {
            throw new System.NotImplementedException();
        }

        public virtual void ganharPoderDeHabilidade()
        {
            throw new System.NotImplementedException();
        }

        public virtual void ganharVida()
        {
            throw new System.NotImplementedException();
        }

        public virtual void ganharMana()
        {
            throw new System.NotImplementedException();
        }
    }
}