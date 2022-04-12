package Raoni.Act01;

public class Professor {
   private String nome;
   private String sexo;
   private String chapa;
   private int cpf ;
   private int identidade;
   private Turma[] turmas;

    public Professor(String nome, String sexo, String chapa, int cpf, int identidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.chapa = chapa;
        this.cpf = cpf;
        this.identidade = identidade;
    }

    public void imprimirTurmas(){
        System.out.println("O professor "+getNome()+ " da aula para essas turmas :\nCódigos das turmas :");
        for(Turma turma : turmas){
            System.out.println(turma.getNumeroDaTurma());
        }
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
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
