package Javacore.ZZEstreams.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1 ,50).filter(k -> k % 2 ==0).forEach(k -> System.out.print(k + " "));
        System.out.println();
        IntStream.range(1 ,50).filter(k -> k % 2 ==0).forEach(k -> System.out.print(k + " "));
        System.out.println();

        Stream.of("Eleve "," O", " Cosmo", " no seu coração")
                .map(String::toUpperCase)
                .forEach(x -> System.out.print(x));

        System.out.println();

        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::print);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
