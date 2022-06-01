package Javacore.ZZEstreams.Test;

import Javacore.ZZEstreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fillmetal Alchemist",5.99),
            new LightNovel("Kimo desuga",1.99),
            new LightNovel("Kimo desuga",1.99),
            new LightNovel("Mnogatari", 4.00)
    ));
    public static void main(String[] args) {
       lightNovels
               .stream()
               .map(LightNovel::getPrice)
               .filter(price -> price > 3)
               .reduce(Double::sum)
               .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);
    }
}
