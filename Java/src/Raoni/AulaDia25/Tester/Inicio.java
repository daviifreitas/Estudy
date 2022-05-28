package Raoni.AulaDia25.Tester;

import Raoni.AulaDia25.Classes.CarrinhoDeCompras;
import Raoni.AulaDia25.Classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Produto> produtosDisponiveis = new ArrayList<>();
        produtosDisponiveis.add(new Produto("Iphone",3000));
        produtosDisponiveis.add(new Produto("Samsung Galaxy", 12900));
        produtosDisponiveis.add(new Produto("Macbook Air M1 ", 120000));

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras("Joao");

        do {
            System.out.println("Escolha um prodto : ");
            for (Produto produtosDisponivei : produtosDisponiveis) {
                System.out.println(produtosDisponivei);
            }
            carrinhoDeCompras.adicionarProduto(produtosDisponiveis.get(input.nextInt()));
            System.out.println("Digite zero para continuar : ");

        }while(input.nextInt() == 0);

        double total = 0 ;
        for (int contador = 0 ; contador < carrinhoDeCompras.getProdutos().size() ; contador++) {
            total+=carrinhoDeCompras.getProdutos().get(contador).getPreco();
        }
        System.out.println("Valor total : "+total);
        System.out.println(carrinhoDeCompras);
     }
}
