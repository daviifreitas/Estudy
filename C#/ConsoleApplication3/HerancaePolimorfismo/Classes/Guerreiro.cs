using System;

namespace HerancaePolimorfismo.Classes
{
    public class Guerreiro : Pessoa
    {
        

        public override void subirDeNivel()
        {

            Level = Level + 1;
            Dano = Dano + 15;
            Magia = Magia + 10;
            Vida = Vida + 250;
            
        }

        public override void receberDano()
        {
            if (Vida > 25)
            {
                Vida -= 25;
            }
            else
            {
                Console.WriteLine("O seu guerreiro faliceu !!!!!");
            }
        }

        public override void ganharVida()
        {
            Vida += 150;
        }

        public override void ganharBuff()
        {
            Dano += 25;
            Magia += 10;
        }

        public Guerreiro(string nome) : base(nome)
        {
            Level = 1;
            Vida = 500;
            Dano = 89;
            Magia = 32;
        }
    }
}