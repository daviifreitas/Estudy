package Raoni.Auladia11.Classes;

public abstract class Personagem {
    private String nome ;
    private int idade ;
    private String cor ;

    public Personagem(String nome, int idade, String cor) {
        setNome(nome);
        setIdade(idade);
        setCor(cor);
    }

    public void andar(){
        System.out.printf("%s está andando e possui %d anos de idade ...", getNome(), getIdade());
    }
    public abstract void pular();

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
