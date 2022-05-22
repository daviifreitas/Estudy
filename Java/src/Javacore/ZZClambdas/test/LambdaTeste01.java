package Javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("William", "Suane", "Luffy", "Zorro");
        forEach(nomes,(String s) -> System.out.println(s));
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        forEach(numeros, (Integer i )-> System.out.println(i));
    }
    private static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
