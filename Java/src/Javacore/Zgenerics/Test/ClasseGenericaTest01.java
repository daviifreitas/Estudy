package Javacore.Zgenerics.Test;

import Javacore.Zgenerics.Dominio.Carro;
import Javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês ...");
        carroRentavelService.returnarCarroAlugado(carro);
    }
}
