using System;

namespace ConsoleApplication01.Atividades_Raoni
{
    public class Principal
    {
        public static void main(string[] args)
        {
            Turma t1 = new Turma(1252,1,"Geografia","B3");
            Console.WriteLine(t1.toString());
            Professor p1 = new Professor("Martinho da Vila","Masculino","Nova revolução",1325478652,2211,"Geografia0");
            t1.assistirAula(p1);
            Aluno a1 = new Aluno("Joaquin","Masculino",12556,123545255,23858,"Jornalismo");
            Console.WriteLine(a1.toString());
        }
    }
}