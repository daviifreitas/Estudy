package Javacore.ZZEstreams.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1 , x -> x + 2)
                .limit(10)
                .forEach(System.out::println);
        Stream.iterate(new int[]{0,1},n -> new int[]{n[1] ,n[0]+n[1]}).limit(10).forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1}, a -> new  int[]{a[1], a[0]+a[1]}).map(a -> a [0]).limit(10).forEach(System.out::println);

        ThreadLocalRandom random = ThreadLocalRandom.current();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Stream.generate(() -> random.nextInt(1 ,500))
                .limit(90)
                .forEach(System.out::println);
    }
}
