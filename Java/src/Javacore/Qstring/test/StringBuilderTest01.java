package Javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome = nome.substring(0 ,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.substring(0 ,2);
        sb.reverse();
        sb.reverse();
        sb.delete(0 ,3);
        System.out.println(sb);

    }
}
