using System;

namespace ConsoleApplication01.Atividades_Raoni
{
    public class Principal
    {
        public static void Maimn(string[] args)
        {
            Aluno a1 = new Aluno("Francisco","Masculino",12581,022515,02222,"ADS");
            Professor p1 = new Professor("Jose", "Masculino", "Assas livres", 28415655, 02020, "Física");
            Professor p2 = new Professor("Maria", "Feminino", "Novidade nova", 12551, 02025, "Matemática");
            Professor p3 = new Professor("Claúdia", "Feminino", "Assas livres", 251455, 02520, "Literatura");
            Professor p4 = new Professor("Gustavo", "Masculino", "Revolução", 2584884, 15515, "Geografia");

            Turma t1 = new Turma(12510, 02, "Física", "02");
            Professor[] professores = {p1, p2, p3, p4};
            t1.professores = professores;
            
            t1.imprimirProfessores();
        }
    }
}