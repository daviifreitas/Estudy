package Raoni.Act01;

public class Principal {
    public static void main(String[] args) {
        Turma t1 = new Turma(1252,1,"Geografia","B3");
        System.out.println(t1);
        Professor p1 = new Professor("Martinho da Vila","Masculino","Nova revolução",1325478652,2211,"Geografia0");
        t1.assistirAula(p1);
        Aluno a1 = new Aluno("Joaquin","Masculino",12556,123545255,23858,"Jornalismo");
        System.out.println(a1);
    }
}
