package Javacore.ZZClambdas.test;

import Javacore.ZZClambdas.Dominio.Anime;
import Javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
       // Collections.sort(animeList, (a1 ,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList ,AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
