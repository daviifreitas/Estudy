package Raoni.ExercicioOpcional.Classes;

public class Guerreiro extends Person{
    Guerreiro(String name) {
        super(name);
        setMana(100);
        setLife(530);
    }

    public void atacar(Guerreiro oponente){
        System.out.println("Atacando o guerreiro : " +oponente.getName());
        oponente.setLife(oponente.getLife() - getDano() );
        System.out.println("O "+oponente.getName() + " recebeu " + getDano() + " de dano");
        System.out.println("--------------------------------------------------------------------------------------");
    }

}
