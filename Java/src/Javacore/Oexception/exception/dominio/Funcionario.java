package Javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando funcionário");
    }
}
