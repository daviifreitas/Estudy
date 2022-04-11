namespace ConsoleApplication01.Atividades_Raoni
{
    public class Professor
    {
        public string nome;
        public string sexo;
        public string chapa;
        public string disciplina;
        public int cpf;
        public int identidade;
        public bool lecionando;
        
        public Professor()
        {
            
        }

        public Professor(string nome ,string sexo ,string chapa ,int cpf ,int identidade , string disciplina)
        {
            this.nome = nome;
            this.sexo = sexo;
            this.chapa = chapa;
            this.identidade = identidade;
            this.disciplina = disciplina;
            this.cpf = cpf;
            this.lecionando = false;

        }
        
        
    }
}