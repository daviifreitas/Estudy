package Raoni.Auladia11.Classes.Personagens;

import Raoni.Auladia11.Classes.Personagem;
import Raoni.Auladia11.Interfaces.PersonagemCorredor;

public class Mario extends Personagem implements PersonagemCorredor {

    public Mario() {
        super("Mario",40 ,"Vermelho");
    }

    @Override
    public void pular(){
        System.out.println("Plunn ...");
    }

    public void correr(){
        System.out.println("Mario está correndo mais rápido do que nunca .......");
    }
}
