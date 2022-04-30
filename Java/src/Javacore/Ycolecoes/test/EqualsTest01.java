package Javacore.Ycolecoes.test;

import Javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");
        System.out.println(s1.equals(s2));
    }
}
