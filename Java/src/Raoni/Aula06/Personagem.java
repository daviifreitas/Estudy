package Raoni.Aula06;

public class Personagem {
    private String nome;
    private int vida;
    private int inteligencia;
    private int habilidade;
    private int forca;
    private String efeito;
    private boolean ativo ;

    public Personagem(String nome , int vida ,int inteligencia , int habilidade ,int forca ,String efeito){
        this.nome = nome;
        this.vida = vida;
        this.inteligencia = inteligencia;
        this.habilidade = habilidade;
        this.forca = forca;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
