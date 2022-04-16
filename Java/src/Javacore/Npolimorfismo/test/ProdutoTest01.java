package Javacore.Npolimorfismo.test;

import Javacore.Npolimorfismo.dominio.Computador;
import Javacore.Npolimorfismo.dominio.Televisao;
import Javacore.Npolimorfismo.dominio.Tomate;
import Javacore.Npolimorfismo.servico.CalculadoraiImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7",11000);
        Tomate tomate = new Tomate("Tomate siciliano",  10);
        Televisao televisao = new Televisao("Samsung 50\"",5000);
        CalculadoraiImposto.CalcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraiImposto.CalcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraiImposto.CalcularImposto(televisao);

    }
}
