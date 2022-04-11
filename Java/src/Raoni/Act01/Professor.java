package Raoni.Act01;

public class Professor {
    private String nome;
    private String sexo;
    private String chapa;
    private String disciplina;
    private int cpf;
    private int identidade;
    private boolean lecionando;

    public Professor() {

    }

    public Professor(String nome, String sexo, String chapa, int cpf, int identidade, String disciplina) {
        this.nome = nome;
        this.sexo = sexo;
        this.chapa = chapa;
        this.cpf = cpf;
        this.identidade = identidade;
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setLecionando(boolean lecionando) {
        this.lecionando = lecionando;
    }

    public boolean getLecionando() {
        return this.lecionando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }
}
