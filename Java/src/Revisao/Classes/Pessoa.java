package Revisao.Classes;

public abstract class Pessoa {
    private String nome ;
    private int dano ;
    private int magia ;
    private int vida;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void status(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
