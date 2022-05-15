package Raoni.Auladia11.Classes.Personagens;

import Raoni.Auladia11.Classes.Personagem;
import Raoni.Auladia11.Interfaces.PersonagemCorredor;

public class Luigi extends Personagem implements PersonagemCorredor {
    public Luigi() {
        super("Luigi", 39 ,"Verrde");
    }

    @Override
    public void pular(){
        System.out.println("Hiper pulooooooooooooo!");
    }

    public void correr(){
        System.out.println("Luigi está correndo ligeiramente ligeiro ........");
    }
}
