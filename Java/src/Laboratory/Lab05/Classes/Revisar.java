package Laboratory.Lab05.Classes;

public interface Revisar {
     default <T> void fazerRevisao(T type){
         System.out.println("Fazendo revisão do "+ type.toString());
    }
}
