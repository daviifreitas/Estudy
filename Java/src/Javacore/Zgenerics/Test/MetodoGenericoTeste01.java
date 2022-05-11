package Javacore.Zgenerics.Test;

import Javacore.Zgenerics.Dominio.Barco;
import Javacore.Zgenerics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Cano Marota"), new Carro("Bmw"));
        System.out.println(barcoList);
    }
    private static <T, X> List<T> criarArrayComUmObjeto(T t, X x){
        List<T> list = List.of(t);
        List<X> list1 = List.of(x);
        System.out.println(list);
        System.out.println(list1);
        return list;
    }

//    private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//        return list ;
//    }
}

