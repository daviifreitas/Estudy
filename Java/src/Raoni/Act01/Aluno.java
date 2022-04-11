package Raoni.Act01;

public class Aluno {
    private String nome ;
    private String sexo;
    private int matricula ;
    private int cpf ;
    private int idetnidade ;
    private String curso ;

    public Aluno(){

    }

    public Aluno(String nome, String sexo, int matricula, int cpf, int idetnidade, String curso) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idetnidade = idetnidade;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", matricula=" + matricula +
                ", cpf=" + cpf +
                ", idetnidade=" + idetnidade +
                ", curso='" + curso + '\'' +
                '}';
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdetnidade() {
        return idetnidade;
    }

    public void setIdetnidade(int idetnidade) {
        this.idetnidade = idetnidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
