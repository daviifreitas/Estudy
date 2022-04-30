package Javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy";
        System.out.println(nome.charAt(2));
        System.out.println(nome.length());
        System.out.println(nome.replace("f" ,"l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0));
        System.out.println(nome.trim());
    }
}
