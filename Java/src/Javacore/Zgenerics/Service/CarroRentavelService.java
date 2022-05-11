package Javacore.Zgenerics.Service;

import Javacore.Zgenerics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(new Carro("Bmw"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro dísponivel.....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carros disponíveis para alugar :");
        System.out.println(carrosDisponiveis);
        return carro ;
    }

    public void returnarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar :");
        System.out.println(carrosDisponiveis);
    }
}
