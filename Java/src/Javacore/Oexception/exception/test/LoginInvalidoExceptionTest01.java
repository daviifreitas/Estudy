package Javacore.Oexception.exception.test;

import Javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String userNameDigitado = input.nextLine();
        System.out.println("Senha");
        String senhaDigitado = input.nextLine();
        if(!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usario ou senha invalidos !!!");
        }
        System.out.println("Usuario logado com sucesso !!!");

    }
}
