package Raoni.Act01;

public class Aluno {
   private String nome;
   private String sexo;
   private int matricula;
   private int cpf;
   private int identidade;
   private boolean dispinivel;

   public Aluno(String nome , String sexo, int matricula ,int cpf ,int identidade ,boolean dispinivel){
       this.nome = nome;
       this.sexo = sexo;
       this.matricula = matricula;
       this.cpf = cpf;
       this.identidade = identidade;
       this.dispinivel = dispinivel;
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

    public void setSexo(String seox) {
        this.sexo = seox;
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

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public boolean getDispinivel() {
        return dispinivel;
    }

    public void setDispinivel(boolean dispinivel) {
        this.dispinivel = dispinivel;
    }
}
