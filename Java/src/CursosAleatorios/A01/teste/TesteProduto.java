package CursosAleatorios.A01.teste;

import CursosAleatorios.A01.Classes.Produto;
import CursosAleatorios.A01.Classes.Tributavel;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto ("Notebook", 4 ,3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
        Tributavel t = new Produto("Smartphone",293 ,3213213);
    }
}
