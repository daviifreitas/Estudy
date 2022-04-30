package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Manga;
import Javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone nokia = new Smartphone("123", "Nokia");
        set.add(nokia);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9 , 0));
        mangas.add(new Manga(1L, "Berserk", 9.5 , 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20 , 2));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99 , 0));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99 , 0));
        mangas.add(new Manga(10L, "Aaragon ", 2.99 , 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
