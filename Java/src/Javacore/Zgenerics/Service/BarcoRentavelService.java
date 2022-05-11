package Javacore.Zgenerics.Service;

import Javacore.Zgenerics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDiponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco dísponivel.....");
        Barco barco = barcosDiponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Carros disponíveis para alugar :");
        System.out.println(barcosDiponiveis);
        return barco ;
    }

    public void retornarBarcosAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcosDiponiveis.add(barco);
        System.out.println("Carros disponíveis para alugar :");
        System.out.println(barcosDiponiveis);
    }
}
