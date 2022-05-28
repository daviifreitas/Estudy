package Javacore.ZZClambdas.test;

import Javacore.ZZClambdas.Dominio.Anime;
import Javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {   

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        System.out.println(animeList);
    }
}
