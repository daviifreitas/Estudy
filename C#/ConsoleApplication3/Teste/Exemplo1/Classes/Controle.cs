using System;
using Teste.Exemplo1.Interfaces;

namespace Teste.Exemplo1.Classes
{
    public class Controle : AcoesControle
    {
        // nome da marca , cor do controle , ele está funcionando e se possui bateria 
        private string marca;
        private string corDoControle;
        private bool estaFuncionando;
        private bool possuiBateria;
        private bool tvLigada;
        private int volume;

        public Controle(string marca , string corDoControle)
        {
            Marca = marca;
            CorDoControle = corDoControle;
            EstaFuncionando = true;
            PossuiBateria = true;
            Volume = 50; 
            TvLigada = false;
        }

        public string Marca { get; set; }
        
        public string CorDoControle { get; set; }
        
        public bool EstaFuncionando { get; set; }
        
        public bool PossuiBateria { get; set; }
        
        public int Volume { set; get; }
        
        public bool TvLigada { get; set; }
        
        public void ligarTv()
        {
            if (TvLigada == false)
            {
                Console.WriteLine("Ligando tv...");
                TvLigada = true;
            }
            else
            {
                Console.WriteLine("A tv já está ligada ...");
            }
        }

        public void desligarTv()
        {
            if (TvLigada)
            {
                Console.WriteLine("Desligando tv ...");
                TvLigada = false;
            }
            else
            {
                Console.WriteLine("A tv já está desligada...");
            }
        }

        public void aumentarVolume()
        {
            if (TvLigada)
            {
                Volume = Volume + 5;
                Console.WriteLine("Aumentando volume....");
                Console.Write("[ ");
                
                for (int i = 0; i < Volume; i += 5)
                {
                    Console.Write("+");
                }

                Console.Write(" ]");
            }
            else
            {
                Console.WriteLine("A tv está desligada ...");
            }
        }

        public void diminuirVolume()
        {
            if (TvLigada)
            {
                if (Volume != 0)
                {
                    Volume = Volume - 5;
                    Console.WriteLine("Diminuindo volume ...");
                    
                    Console.Write("[ ");
                    
                    for (int i = 0; i < Volume; i += 5)
                    {
                        Console.Write("+");
                    }
                    
                    Console.Write(" ]");
                }
            }
            else
            {
                Console.WriteLine("A tv está desligada ...");
            }
        }

        public void trocarBateria()
        {
            if (PossuiBateria)
            {
                Console.WriteLine("Não há necessidade de trocar a bateria ...");
            }
            else
            {
                Console.WriteLine("Trocando pilha ...");
                PossuiBateria = true;
            }
        }
    }
}