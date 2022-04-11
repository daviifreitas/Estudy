package Lambda.Oexception.ChechedException.Test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        ciarArquivo();

    }
    public static void ciarArquivo(){
        File file = new File("Teste.tx");
        try {

            System.out.println("Arquivo criado ? "+file.createNewFile());
              System.out.println("Arquivo criado !");
        } catch(IOException e ){
            e.printStackTrace();
        }
    }
}
