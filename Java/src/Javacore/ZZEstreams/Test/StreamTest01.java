package Javacore.ZZEstreams.Test;
//1 . Order lightNovel by title
//2. Retrive the first 3 light Novels with price less then 4

import Javacore.ZZEstreams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        System.out.println(lightNovels);
    }
}
