using System;

namespace ConsoleApplication01.Atividades_Raoni
{
    public class Turma
    {
        public int numeroDaTurma;
        public int numeroDaSala;
        public string disciplina;
        public string bloco;
        public bool disponivel = true;
        public Professor[] professores;
        
        public Turma(){}

        public Turma(int numeroDaTurma, int numeroDaSala, string disciplina, string bloco)
        {
            this.numeroDaTurma = numeroDaTurma;
            this.numeroDaSala = numeroDaSala;
            this.disciplina = disciplina;
            this.bloco = bloco;
        }

        public void imprimirProfessores()
        {
            Console.WriteLine("Professores que dão aula para a turma "+this.numeroDaTurma+" :");
            foreach (Professor professor in professores)
            {
                Console.WriteLine(professor.nome);
            }
        }

        public string toString()
        {
            return "Turma{" +
                   "numeroDaTurma=" + numeroDaTurma +
                   ", numeroDaSala=" + numeroDaSala +
                   ", disciplina='" + disciplina + '\'' +
                   ", bloco='" + bloco + '\'' +
                   ", disponivel=" + disponivel +
                   '}';
        }
        
    }
}