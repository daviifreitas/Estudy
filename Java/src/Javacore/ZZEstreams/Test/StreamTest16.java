package Javacore.ZZEstreams.Test;

import Javacore.ZZEstreams.Dominio.Category;
import Javacore.ZZEstreams.Dominio.LightNovel;
import Javacore.ZZEstreams.Dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumLongStremIterate(num);
        sumLongParallelStremIterate(num);

    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum stremIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        for (long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }


    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum stremIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        for (long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumLongStremIterate(long num) {
        System.out.println("Sum stremIterate");
        long result = LongStream.rangeClosed(1L ,num).reduce(0L , Long::sum);
        long init = System.currentTimeMillis();

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongParallelStremIterate(long num) {
        System.out.println("Sum stremIterate");
        long result = LongStream.rangeClosed(1L ,num).parallel().reduce(0L , Long::sum);
        long init = System.currentTimeMillis();

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

}
