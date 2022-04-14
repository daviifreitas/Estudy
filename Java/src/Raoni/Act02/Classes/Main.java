package Raoni.Act02.Classes;

import Raoni.Act02.Enums.MageClass;
import Raoni.Act02.Enums.WarriorClass;

public class Main {
    public static void main(String[] args) {
        Mage m1 = new Mage("Power", "Void", MageClass.GNOME);
        m1.levelUp();
        Mage m2 = new Mage("Ok", "The power", MageClass.HUMAN);
        Mage m3 = new Mage("Kill","The death", MageClass.NIGHT_ELF);
        Mage[] mages = {m1 ,m2 ,m3};

        Warrior w1 = new Warrior("Carlao","GUme do infinito","Capa de fogo",25, WarriorClass.CAVALIER);
        Warrior w2 = new Warrior("Blindao","Armadura de espinhos","Randuin",12 ,WarriorClass.CAVALIER);
        Warrior w3 = new Warrior("Kingist","Devorador de mundos","Armadura de fogo solari",10 ,WarriorClass.CAVALIER);
        Warrior[] warriors = {w1 ,w2 ,w3};

        Guild g1 = new Guild("The power", mages, warriors);

        g1.viewMenbers();

    }
}
