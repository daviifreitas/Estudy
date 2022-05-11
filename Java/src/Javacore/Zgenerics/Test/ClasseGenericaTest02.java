package Javacore.Zgenerics.Test;

import Javacore.Zgenerics.Dominio.Barco;
import Javacore.Zgenerics.Dominio.Carro;
import Javacore.Zgenerics.Service.BarcoRentavelService;
import Javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando carro por um mês ...");
        barcoRentavelService.retornarBarcosAlugado(barco);
    }
}
