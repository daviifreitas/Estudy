package Raoni.AulaDia25.Classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private String comprador ;
    private List<Produto> produtos;

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "comprador='" + comprador + '\'' +
                ", produtos=" + produtos +
                '}';
    }

    public CarrinhoDeCompras(String comprador){
        produtos = new ArrayList<>();
        setComprador(comprador);
    }

    public String getComprador(){
        return this.comprador;
    }
    public void setComprador(String comprador){
        this.comprador = comprador ;
    }
    public List<Produto> getProdutos(){
        return this.produtos ;
    }
    public void adicionarProduto(Produto P ){
        System.out.println("Adicionando mais um novo produto .....");
        produtos.add(P);
    }
}
