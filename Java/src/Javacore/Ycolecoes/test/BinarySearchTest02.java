package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99));

        //Collections.sort(mangas);

        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(8L, "Dragon ball z ", 2.99);

        System.out.println(Collections.binarySearch(mangas,mangaToSearch ,new MangaByIdComparator()));
    }
}
