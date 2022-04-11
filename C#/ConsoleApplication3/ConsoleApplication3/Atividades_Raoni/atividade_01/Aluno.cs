namespace ConsoleApplication01.Atividades_Raoni
{
    public class Aluno
    {
        public string nome;
        public string sexo;
        public int matricula;
        public int cpf;
        public int identidade;
        public string curso;
        
        public Aluno(){}

        public Aluno(string nome, string sexo, int matricula, int cpf, int identidade, string curso)
        {
            this.nome = nome;
            this.sexo = sexo;
            this.matricula = matricula;
            this.cpf = cpf;
            this.identidade = identidade;
            this.curso = curso;
            
        }

        public string toString()
        {
            return "Aluno{" +
                   "nome='" + nome + '\'' +
                   ", sexo='" + sexo + '\'' +
                   ", matricula=" + matricula +
                   ", cpf=" + cpf +
                   ", idetnidade=" + identidade +
                   ", curso='" + curso + '\'' +
                   '}';
        }
        
    }
}