package Raoni.AulaDia25.Classes;

public class Produto {
    private String nome ;
    private double preco ;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
