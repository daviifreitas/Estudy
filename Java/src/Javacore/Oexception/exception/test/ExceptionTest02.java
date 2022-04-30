package Javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNOvoArquivo();
    }

    private static void criarNOvoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile(); // if this problem that throws the exception the program will be got out for the
            System.out.println("Arquivo criado ? "+isCriado); // catch line !
        }catch (IOException exception){
            exception.printStackTrace();
            throw exception;
        }
    }
}
