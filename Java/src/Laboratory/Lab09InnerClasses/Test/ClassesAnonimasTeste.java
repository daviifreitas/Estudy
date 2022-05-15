package Laboratory.Lab09InnerClasses.Test;

import Laboratory.Lab05.Classes.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Animal{
    public void andar(){
        System.out.println("Animal está andando");
    }
}
public class ClassesAnonimasTeste {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void andar() {
                System.out.println("Andando anonimamente");
            }
            public void comer(){
                System.out.println("Comendo");
            }
        };
        a.andar();
        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("AUDI", "TT", 38222));
        carroList.add(new Carro("Vw", "Fox", 3322));
        carroList.sort(new Comparator<Carro>(){
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getMarca().compareTo(o2.getMarca());
            }
        });
        System.out.println(carroList);

        Tester02 tester02 = new Tester02(){

            @Override
            public void fazerAtividade() {

            }
        } ;
    }
}
class CarroComparator implements Comparator<Carro>{

    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
