package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Consumidor;
import Javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
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

        List<Manga> mangarConsumidor1List = List.of(manga1 ,manga2 ,manga3);
        List<Manga> mangarConsumidor1List2 = List.of(manga3 ,manga4);



        Map<Consumidor , List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1 , mangarConsumidor1List);
        consumidorMangaMap.put(consumidor2 , mangarConsumidor1List2);

        for(Map.Entry<Consumidor , List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }
    }

}
