using System;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;

namespace ConsoleApplication01.OOP
{
    public class Aula28
    {
        public static void Man()
        {

            Inimigo i1 = new Inimigo("Doido");
            Inimigo i2 = new Inimigo("Maluco");
            Inimigo i3 = new Inimigo("Pirado");

            Inimigo.alerta = true;
            
            i1.info();
            Console.WriteLine("+++++++++++++++++++++++++++");
            i2.info();
            Console.WriteLine("____________________________");
            i3.info();
        }
    }

    static public class Jogador
    {
        static public int energia;
        static public bool vivo ;
        static public string nome;

        static public void iniciar(string n)
        {
            nome = n;
            energia = 100;
            vivo = true;
        }
        
        static public void info()
        {
            Console.WriteLine("Nome do jogador :{0}\nEnergia do jogador : {1}\nEstado do Jogador : {2}",nome ,energia ,vivo);
        }
    }

    class Inimigo
    {
        static public bool alerta;
        public string nome;

        public Inimigo(string nome )
        {
            alerta = false;
            this.nome = nome;
        }

        public void entrarEmAlerta()
        {
            alerta = true;
        }

        public void info()
        {
            Console.WriteLine("O nome do Inimigo : {0}\nO Inimigo está em alerta ? {1}",this.nome, alerta);
        }
    }
}