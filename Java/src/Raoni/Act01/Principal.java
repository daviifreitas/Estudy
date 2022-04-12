package Raoni.Act01;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Francisco","Masculino",1235854,11323255,58154,true);
        Professor p1 = new Professor("josivaldo","Masculino","novidade do amanhã",12521598,02551);
        Professor p2 = new Professor("Roberta","Feminino","Resistência",65818518,12232);
        Professor p3 = new Professor("João","Masculino","Resistência",265515,20202);
        Professor p4 = new Professor("Ana","Feminino","Revolução",25845111,15555);

        Professor[] professores = {p1 ,p2 ,p3 ,p4};

        Turma t1 = new Turma(04,12,"Física",2,true,professores);
        Turma t2 = new Turma(25,02,"Matemática",2,true,professores);
        System.out.println(t1.toString());
        System.out.println("_____________________Elenco de professores____________________");
        t1.imprimirProfessores();

        Turma[] turmas = {t1, t2};

        p1.setTurmas(turmas);

        p1.imprimirTurmas();
    }
}
