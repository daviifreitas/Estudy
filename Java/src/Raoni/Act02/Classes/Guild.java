package Raoni.Act02.Classes;

import Raoni.Act02.Enums.MageClass;
import Raoni.Act02.Enums.WarriorClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Guild {
    private int level;
    private int gold;
    private String warName;
    private List<Mage> mages = new ArrayList<>();
    private List<Warrior> warriors= new ArrayList<>();

    public Guild(String name ){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
    }


    public Guild(String warName, List<Warrior> warriors, List<Mage> mages ){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
        this.warriors = warriors;
        this.mages = mages;
    }

    public void viewMenbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want view mages or warriors ? \nType here :");
        String decision = input.nextLine();

        if(decision.equals("mages")){
            System.out.println("Do you see what's class about mage ?\n 1 - Human\n2 - Gnome\n3 - night elf\nType here :");
            int what  = input.nextInt();

            if(what == 1){
                System.out.println("----------------------------------------------------------------------------");
                mages.stream().filter(mages -> mages.getMc().equals(MageClass.HUMAN)).forEach(Mage::status);

            }

            else if (what == 2){
                System.out.println("----------------------------------------------------------------------------");
                mages.stream().filter(mages -> mages.getMc().equals(MageClass.GNOME)).forEach(Mage::status);

            }

            else if (what == 3){
                System.out.println("----------------------------------------------------------------------------");
                mages.stream().filter(mages -> mages.getMc().equals(MageClass.NIGHT_ELF)).forEach(Mage::status);
            }
        }

        else if (decision.equals("warriors")){

            System.out.println("Do you see what's class about warrior ? \n1 - Knight\n2 - Cavalier \n3 - Duelist\nType here : ");
            int what = input.nextInt();

            if (what == 1){
                System.out.println("----------------------------------------------------------------------------");
                warriors.stream().filter(warrior -> warrior.getWc().equals(WarriorClass.KNIGHT)).forEach(Warrior::status);

            }

            else if (what ==2){
                System.out.println("----------------------------------------------------------------------------");
                warriors.stream().filter(warrior -> warrior.getWc().equals(WarriorClass.CAVALIER)).forEach(Warrior::status);

            }

            else if (what == 3){
                System.out.println("----------------------------------------------------------------------------");
                warriors.stream().filter(warrior -> warrior.getWc().equals(WarriorClass.DUELIST)).forEach(Warrior::status);
            }
        }
    }

    public List<Mage> getMages() {
        return mages;
    }

    public List<Warrior> getWarriors() {
        return warriors;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getWarName() {
        return warName;
    }

    public void setWarName(String warName) {
        this.warName = warName;
    }
}
