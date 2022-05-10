package Javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import Javacore.Ycolecoes.dominio.Manga;
import Javacore.Ycolecoes.dominio.Smartphone;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        // TODO Auto-generated method stub
        return o1.getBrand().compareTo(o2.getBrand());
    }

}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Attack on titan", 19.9 , 0));
        mangas.add(new Manga(1L, "Berserk", 9.5 , 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20 , 2));
        mangas.add(new Manga(2L, "Dragon ball z ", 2.99 , 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99 , 0)); 

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yakusuko = new Manga(10L, "Yuyu hakusho", 3.2 , 5);
        // lower -> Consegue pegar o menor objeto pela comparação 
        // floor -> Flor vai trazer o mesmo valor que você está passando caso não , o imediato a baixo 
        //higher  -> o Primeiro maior 
        // ceiling  -> Leva em consideração o valor que você está passando !
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println(mangas.lower(yakusuko));
        System.out.println(mangas.floor(yakusuko));
        System.out.println(mangas.higher(yakusuko));
        System.out.println(mangas.ceiling(yakusuko));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
