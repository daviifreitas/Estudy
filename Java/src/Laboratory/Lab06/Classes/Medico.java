package Laboratory.Lab06.Classes;

/**
 * Uma classe que implementa uma interface que possui uma questão do generics onde o mesmo vai ser substituido por pessoa
 * assim fazendo a questão do type erasure, na própria ‘interface’, como é adicionado no diamante recursivo.
 */
public class Medico implements ConsultaMedica<Pessoa> {
    private String nome ;
    private int idade ;
    private String nomePaciente;
    private boolean disponivel ;

    public Medico(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nomePaciente='" + nomePaciente + '\'' +
                '}';
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
