using System;

namespace HerancaePolimorfismo.Classes
{
    public abstract class Pessoa
    {
        private string nome;
        private int vida;
        private int dano;
        private int magia;
        private int level;

        protected Pessoa(string nome)
        {
            this.nome = nome;
        }

        public void status()
        {
            Console.WriteLine($"Nome : {Nome}\nLevel : {Level}\nDano : {Dano}\nMagia : {Magia}\nVida : {Vida}");
        }

        public int Level
        {
            get => level;
            set => level = value;
        }

        public string Nome
        {
            get => nome;
            set => nome = value;
        }

        public int Vida
        {
            get => vida;
            set => vida = value;
        }

        public int Dano
        {
            get => dano;
            set => dano = value;
        }

        public int Magia
        {
            get => magia;
            set => magia = value;
        }
        
        public virtual void subirDeNivel(){}
        
        public virtual void receberDano(){}
        
        public virtual void ganharVida(){}
        
        public virtual void ganharBuff(){}
    }
}