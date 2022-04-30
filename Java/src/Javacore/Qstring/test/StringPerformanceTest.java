package Javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        long fin = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+(fin - inicio) + " ms");


    }


    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=1;
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
