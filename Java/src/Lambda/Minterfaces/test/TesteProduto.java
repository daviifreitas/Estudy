package Lambda.Minterfaces.test;

import Lambda.Minterfaces.Classes.Produto;
import Lambda.Minterfaces.Classes.Tributavel;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4,3000);

        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
