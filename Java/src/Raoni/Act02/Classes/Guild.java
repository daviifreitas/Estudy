package Raoni.Act02.Classes;

import Raoni.Act02.Enums.MageClass;
import Raoni.Act02.Enums.WarriorClass;

import java.util.Arrays;
import java.util.Scanner;

public class Guild {
    private int level;
    private int gold;
    private String warName;
    private Mage[] mages;
    private Warrior[] warrios;

    public Guild(String name ){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
    }

    public Guild(String name , Mage[] mages){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
        this.mages = mages ;
    }

    public Guild(String name , Warrior[] warrios){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
        this.warrios = warrios;
    }

    public Guild(String name , Mage[] mages, Warrior[] warrios){
        setLevel(1);
        setGold(1000);
        setWarName(warName);
        this.mages = mages ;
        this.mages = mages ;
        this.warrios = warrios;
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
                Arrays.stream(mages).filter(mages -> mages.getMc().equals(MageClass.HUMAN)).forEach(System.out::println);

            }

            else if (what == 2){
                System.out.println("----------------------------------------------------------------------------");
                Arrays.stream(mages).filter(mages -> mages.getMc().equals(MageClass.GNOME)).forEach(System.out::println);

            }

            else if (what == 3){
                System.out.println("----------------------------------------------------------------------------");
                Arrays.stream(mages).filter(mages -> mages.getMc().equals(MageClass.NIGHT_ELF)).forEach(System.out::println);
            }
        }

        else if (decision.equals("warriors")){

            System.out.println("Do you see what's class about warrior ? \n1 - Knight\n2 - Cavalier \n3 - Duelist\nType here : ");
            int what = input.nextInt();

            if (what == 1){
                System.out.println("----------------------------------------------------------------------------");
                Arrays.stream(warrios).filter(warrior -> warrior.getWc().equals(WarriorClass.KNIGHT)).forEach(System.out::println);

            }

            else if (what ==2){
                System.out.println("----------------------------------------------------------------------------");
                Arrays.stream(warrios).filter(warrior -> warrior.getWc().equals(WarriorClass.CAVALIER)).forEach(System.out::println);

            }

            else if (what == 3){
                System.out.println("----------------------------------------------------------------------------");
                Arrays.stream(warrios).filter(warrior -> warrior.getWc().equals(WarriorClass.DUELIST)).forEach(System.out::println);
            }
        }
    }

    public void setMages(Mage[] mages) {
        this.mages = mages;
    }

    public void setWarrios(Warrior[] warrios) {
        this.warrios = warrios;
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
