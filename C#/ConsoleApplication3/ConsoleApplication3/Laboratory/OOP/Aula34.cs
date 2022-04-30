using System;

namespace ConsoleApplication01.OOP
{
    public class Aula34
    {
        public static void Mai(string[] args)
        {
           /* Carro c1 = new Carro("Ligeiro","Preto");
            c1.Ligar();

            Console.WriteLine($"Nome do veículo : {c1.cor}\nCor : {c1.modelo}" +
                              $"\nQuantidade de Rodas : {c1.rodas}\nVelocidade máxima: {c1.velMax}\nO Carro está ligado ? {c1.getLigado()}");
            Console.WriteLine("+++++++++++++++++++++++++++++++++++++++++++++");
            
            CarroCombate cc = new CarroCombate(100);

            Console.WriteLine($"Cor :{cc.cor}\nNome {cc.modelo}\nRodas {cc.getRodas()}\nVelocidade máxima : {cc.velMax}\nQuantidade de munição {cc.municao}");
            */
        }
    }

   /*class Veiculo
    {
        public int rodas;
        public int velMax;
        private bool ligado;

        public Veiculo(int rodas)
        {
            this.rodas = rodas;
        }

        public void Ligar()
        {
            this.ligado = true;
        }

        public void Desligar()
        {
            this.ligado = false;
        }

        public string getLigado()
        {
            return ligado ? "sim" : "não";
        }

        public int getRodas()
        {
            return this.rodas;
        }

        public void setRodas(int rodas)
        {
            this.rodas = rodas;
        }
    }

    class Carro : Veiculo
    {
        public string modelo;
        public string cor;
        public Carro(string cor , string modelo) : base(4)
        {
            Desligar();
            rodas = 4;
            velMax = 120;
            this.cor = cor;
            this.modelo = modelo;

        }
    }

    class CarroCombate : Carro
    {
        public int municao;
        
        public CarroCombate( int municao) : base("Verde ","Carro de Combate")
        {
            this.municao = municao;
            setRodas(6);
        }
    }*/
    
}
