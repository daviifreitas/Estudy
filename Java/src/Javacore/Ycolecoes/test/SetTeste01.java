package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9 , 0));
        mangas.add(new Manga(1L, "Berserk", 9.5 , 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20 , 2));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99 , 0));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99 , 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
