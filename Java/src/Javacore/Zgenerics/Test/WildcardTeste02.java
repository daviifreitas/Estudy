package Javacore.Zgenerics.Test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro() , new Cachorro());
        List<Gato> gatos = List.of(new Gato() , new Gato());
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }
    // type erasure
    // wildCard ?
    private static void printConsulta(List<? extends  Animal> animals){ // ---> precisa passar exatamente o que está sendo passado no generics !!!!

        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
