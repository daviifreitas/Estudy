using Teste.Exemplo1.Classes;

namespace Teste.Exemplo1.Teste
{
    public class Teste01
    {
        public static void Main(string[] args)
        {
            Controle controle1 = new Controle("Positivo", "Preta");
            controle1.ligarTv();
            controle1.aumentarVolume();
            controle1.diminuirVolume();
        }
    }
}