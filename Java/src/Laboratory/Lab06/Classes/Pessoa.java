package Laboratory.Lab06.Classes;

import Laboratory.Lab06.Enuns.Sintomas;

public class Pessoa {
    private Sintomas doenca ;
    private String nome ;
    private int idade ;
    private long cpf ;
    private boolean fezConsuta;


    public Pessoa(String nome, int idade, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "doenca=" + doenca +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }

    public boolean isFezConsuta() {
        return fezConsuta;
    }

    public void setFezConsuta(boolean fezConsuta) {
        this.fezConsuta = fezConsuta;
    }

    public Sintomas getDoenca() {
        return doenca;
    }

    public void setDoenca(Sintomas doenca) {
        this.doenca = doenca;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


}
