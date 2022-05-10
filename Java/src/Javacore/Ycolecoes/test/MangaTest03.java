package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Consumidor;
import Javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MangaTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Sane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga3 = new Manga(5L, "Attack on titan", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga1 = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball z ", 2.99);
        Map<Consumidor ,Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);
        for (Map.Entry<Consumidor ,Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " +entry.getValue().getNome());
        }
    }

}
