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
        
        public Turma(){}

        public Turma(int numeroDaTurma, int numeroDaSala, string disciplina, string bloco)
        {
            this.numeroDaTurma = numeroDaTurma;
            this.numeroDaSala = numeroDaSala;
            this.disciplina = disciplina;
            this.bloco = bloco;
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

        public void assistirAula(Professor p)
        {
            if (!this.disciplina.Equals(p.disciplina))
            {
                Console.WriteLine("Esse é o professor da disciplina errada !!!!\nOu seja a turma está sem aula !!!");
                this.disponivel = true;
            }
            else
            {
                Console.WriteLine("A turma está assistindo a aula do professor :"+p.nome+"\nDa materia de : "+p.disciplina);
                p.lecionando = true;
                this.disponivel = false;
            }
        }
    }
}