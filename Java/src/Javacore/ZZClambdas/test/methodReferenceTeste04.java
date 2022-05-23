package Javacore.ZZClambdas.test;

import Javacore.ZZClambdas.Dominio.Anime;
import Javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class methodReferenceTeste04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
//        AnimeComparators animeComparators = () -> new AnimeComparators();
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);

        BiFunction<String ,Integer ,Anime> animeBiFunction = (title, episodes) -> new Anime(title ,episodes);
        BiFunction<String ,Integer ,Anime> animeBiFunction1 = Anime::new;
        animeBiFunction1.apply("Super campeões", 36 );
        System.out.println(animeList);
    }
}
