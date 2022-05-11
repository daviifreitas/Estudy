package Javacore.Zgenerics.Service;

import Javacore.Zgenerics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(new Carro("Bmw"), new Carro("Fusca")));

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando carro dísponivel.....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+t);
        System.out.println("Objetos disponíveis para alugar :");
        System.out.println(objetosDisponiveis);
        return t ;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto "+t);
        objetosDisponiveis.add(t);
        System.out.println("objeto disponíveis para alugar :");
        System.out.println(objetosDisponiveis);
    }
}
