namespace aula_api;

public class Cliente
{
    private int id { get; set; }
    private string nome { get; set; }
    private string email { set; get; }
    private int idade { get; set; }


    public Cliente(string nome, string email, int idade, int id)
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.id = id;
    }
}