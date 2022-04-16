package Javacore.Npolimorfismo.servico;

import Javacore.Npolimorfismo.dominio.Computador;
import Javacore.Npolimorfismo.dominio.Produto;
import Javacore.Npolimorfismo.dominio.Televisao;
import Javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraiImposto {

    public static void CalcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto :"+produto.getNome());
        System.out.println("Valor : "+produto.getValor());
        System.out.println("Imposto a ser pago : "+imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        } else if (produto instanceof Computador){
            System.out.println("O relatório do computador !!!");
        } else if (produto instanceof Televisao){
            System.out.println("O relatório da televisão");
        }
    }
}
