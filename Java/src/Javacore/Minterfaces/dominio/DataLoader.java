package Javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissão do sistema !");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
