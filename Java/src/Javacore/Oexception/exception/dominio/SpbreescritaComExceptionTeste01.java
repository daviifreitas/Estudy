package Javacore.Oexception.exception.dominio;

public class SpbreescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {

        }
    }
}
