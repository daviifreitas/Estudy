package Raoni.Act01;

public class Turma {
    private int numeroDaTurma;
    private int numeroDaSala;
    private String disciplina;
    private int bloco;
    private boolean disponivel;
    private Professor[] professores;

    public Turma(int numeroDaTurma, int numeroDaSala, String disciplina, int bloco, boolean disponivel, Professor[] professores) {
        this.numeroDaTurma = numeroDaTurma;
        this.numeroDaSala = numeroDaSala;
        this.disciplina = disciplina;
        this.bloco = bloco;
        this.disponivel = disponivel;
        this.professores = professores;
    }

    public void imprimirProfessores(){
        System.out.println("Professores que lecionam aula para essa turma !!!");
        for(Professor professor : professores){
            System.out.println(professor.getNome());
        }
    }

    @Override
    public String toString() {
        return "Turma{" +
                "numeroDaTurma=" + numeroDaTurma +
                ", numeroDaSala=" + numeroDaSala +
                ", disciplina='" + disciplina + '\'' +
                ", bloco=" + bloco +
                ", disponivel=" + disponivel +
                '}';
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public int getNumeroDaTurma() {
        return numeroDaTurma;
    }

    public void setNumeroDaTurma(int numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

