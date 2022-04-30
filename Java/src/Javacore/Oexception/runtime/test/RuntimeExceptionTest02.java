package Javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Arumento ilegal , não pode ser 0");
        }

        return a / b;
    }
}
