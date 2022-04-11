package Raoni.Act01;

public class Turma {
    private int numeroDaTurma;
    private int numeroDaSala;
    private String disciplina;
    private String bloco;
    private boolean disponivel = true;

    public Turma() {

    }

    public Turma(int numeroDaTurma, int numeroDaSala, String disciplina, String bloco) {
        this.numeroDaTurma = numeroDaTurma;
        this.numeroDaSala = numeroDaSala;
        this.disciplina = disciplina;
        this.bloco = bloco;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "numeroDaTurma=" + numeroDaTurma +
                ", numeroDaSala=" + numeroDaSala +
                ", disciplina='" + disciplina + '\'' +
                ", bloco='" + bloco + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }

    public void assistirAula(Professor p) {
        if (!getDisciplina().equals(p.getDisciplina())) {
            System.out.println("Esse é o professor da disciplina errada !!!!\nOu seja a turma está sem aula \nEBA!!!!!!!!!!!");
            setDisponivel(true);
        } else {
            System.out.println("A turma está assistindo a aula do professor : " + p.getNome() + "\nDa matéria de " + p.getDisciplina());
            p.setLecionando(true);
            setDisponivel(false);
        }
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

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

