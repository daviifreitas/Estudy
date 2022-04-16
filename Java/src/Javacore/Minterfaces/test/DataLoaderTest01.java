package Javacore.Minterfaces.test;

import Javacore.Minterfaces.dominio.DataBaseLoader;
import Javacore.Minterfaces.dominio.DataLoader;
import Javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retrieveMaxDataSize();
    }
}
