package Javacore.ZZEstreams.Test;

import Javacore.ZZEstreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .isPresent();
    }
}
