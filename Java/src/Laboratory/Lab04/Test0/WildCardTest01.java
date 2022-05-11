package Laboratory.Lab04.Test0;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro !!!");
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gato !!!!");
    }
}
public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro() , new Cachorro()};
        Gato[] gatoes = {new Gato() , new Gato()};

        consultarAnimais(cachorros);
        consultarAnimais(gatoes);
    }
    public static void consultarAnimais(Animal [] animals){
        for (Animal a : animals){
            a.consulta();
        }
    }
}
