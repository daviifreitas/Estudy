package Javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("POkemon");
        mangas.add("Dragon ball z");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();

        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
        for(String manga : mangas){
            System.out.println(manga);
        }
    }
}
