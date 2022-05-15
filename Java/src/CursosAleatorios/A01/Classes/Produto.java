package CursosAleatorios.A01.Classes;

public class Produto implements Tributavel , Transportavel{
    private String nome ;
    private double peso;
    private double preco ;
    private double precoFinal;
    private double valorFrete ;


    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public void calcularImposto() {
        this.precoFinal = this.preco + this.preco*IMPOSTO;

    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco/peso ;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public void setValorFrete(double valorFrete){
        this.valorFrete = valorFrete ;
    }
    public double getValorFrete(){
        return this.valorFrete ;
    }

    public void setPrecoFinal(double precoFinal){
        this.precoFinal = precoFinal ;
    }

    public double getPrecoFinal(){
        return this.precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
