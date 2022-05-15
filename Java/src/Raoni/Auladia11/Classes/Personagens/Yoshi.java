package Raoni.Auladia11.Classes.Personagens;

import Raoni.Auladia11.Classes.Personagem;

public class Yoshi extends Personagem {

    public Yoshi(){
        super("Yoshi", 13,"Verde");
    }


    @Override
    public void pular() {
        System.out.println("Pulando...");
    }
}
