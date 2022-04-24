package Raoni.Simulacao;

public class Pessoa {
    private String nome;
    private int idade ;

    public void fazerAniversario(){
        this.idade = this.idade + 1 ;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
