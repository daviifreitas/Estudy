package Revisao.Classes;

public class Warrior extends Pessoa {

    public Warrior(String nome)  {
        super(nome);
        setDano(80);
        setMagia(30);
        setVida(500);
    }

    @Override
    public void status() {
        System.out.printf("\nNome : %s\nVida : %d\nDano : %d\nMagia : %d",
                getNome() ,getVida() ,getDano() ,getMagia());
    }
}
