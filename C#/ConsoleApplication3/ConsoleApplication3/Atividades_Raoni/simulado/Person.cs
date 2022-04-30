namespace ConsoleApplication3.Atividades_Raoni.simulado
{
    public class Person
    {
        private string name;
        private int idade;

        public Person(string name, int idade)
        {
            this.idade = idade;
            this.name = name;
        }

        public string Name
        {
            get
            {
                return this.name;
            }
            set
            {
                name = value;
            }
        }

        public int Idade
        {
            get
            {
                return idade;
            }
            set
            {
                idade = value;
            }
        }

        public void fazerAniversario()
        {
            this.idade = this.idade + 1;
        }

        
    }
}