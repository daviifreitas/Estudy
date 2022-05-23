package Laboratory.Lab10.Tester;

import java.util.function.Consumer;

public class Tester02 {
    public static void main(String[] args) {
        // 0 1 3 0 2

        Integer[] valores = new Integer[]{3 ,2 ,1 ,1,0  };
        Integer[] numeros = new Integer[valores.length];
        int contagem = 0 ;

        for(int i = 1 ; i<valores.length ; i++){
            for(int j = 0 ; j < valores.length - 1; j++){
                if(numeros[j + 1 ] == null){
                    contagem++;
                    if(contagem == valores[i -1]){
                        if(numeros[j] != null){
                        } else if (numeros[j+1] == null) {
                            numeros[j+1] = i;
                            contagem = 0 ;
                        } else if (contagem == 2){
                            numeros[j] = i;
                        } else if (contagem == 1){
                            numeros[j] = 1 ;
                        }
                    }
                }

            }
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
