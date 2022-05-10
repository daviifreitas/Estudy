package Javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String ,String> map = new LinkedHashMap<>();
        map.put("Teklado", "Teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você");
        System.out.println(map);

        for(String chave : map.keySet()){
            System.out.println(chave + " : " +map.get(chave));
        }
        System.out.println("_----------------------------------------------------");

        for(String key : map.values()){
            System.out.println(key);
        }

        System.out.println("_----------------------------------------------------------------");
        for(Map.Entry<String ,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }
    }
}
