public class Principal {

    public static void main(String[] args) {

        Turma t1 = new Turma();
        t1.bloco = "A";
        t1.disciplina = "geografia";
        t1.numeroDaSala = 12;
        t1.numeroDaTurma = 30;
        t1.disponivel = true;

        Aluno a1 = new Aluno();
        a1.cpf = "123.123.123-22";
        a1.curso = "Engenharia";
        a1.identidade = "9.756.564";
        a1.matricula = "1";
        a1.sexo = "M";
        a1.nome = "Magnaldo";

        Professor p1 = new Professor();
        p1.chapa = "Unidos para vencer";
        p1.cpf = "345.345.345-55";
        p1.nome = "Asvaldo";
        p1.sexo = "M";
        p1.identidade = "7.425.234";



        darAula(t1.disciplina, t1.numeroDaTurma, a1.nome, p1.nome);

    }
    public static void darAula(String disciplina, int numeroDaTurma, String nomeDoAluno, String nomeDoProfessor) {


        System.out.println(disciplina);
        System.out.println(numeroDaTurma);
        System.out.println(nomeDoAluno);
        System.out.println(nomeDoProfessor);

    }

}

class Turma{

    public int numeroDaTurma;
    public int numeroDaSala;
    public String disciplina;
    public String bloco;
    public Boolean disponivel;

}

class Aluno{
    public String nome;
    public String sexo;
    public String matricula;
    public String cpf;
    public String identidade;
    public String curso;

}
class Professor{
    public String nome;
    public String sexo;
    public String cpf;
    public String identidade;
    public String chapa;
}