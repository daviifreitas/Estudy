package Raoni.Act02.Classes;

import Raoni.Act02.Enums.MageClass;
import Raoni.Act02.Interfaces.Comands;

public class Mage extends Person implements Comands {
    private String staff ;
    private MageClass mc;


    public Mage(String name, String staff, MageClass mc) {
        super(name);

        this.mc = mc ;

        this.staff = staff;

        setLevel(1);
        setManaAmount(500);
        setLife(100);
        setAp(250);
        setAd(25);
    }

    @Override
    public void status() {
        System.out.printf("\nClass : %s\nName : %s\nLife : %d\nMana : %d\nAbility Power : %d\nAttack Damage : %d\nLevel : %d",
                getMc(), getName() ,getLife() ,getManaAmount() ,getAp() ,getAd() ,getLevel());
    }

    @Override
    public String toString() {
        return "Mage{" +
                "staff='" + staff + '\'' +
                ", mc=" + mc +
                '}';
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public MageClass getMc() {
        return mc;
    }

    public void setMc(MageClass mc) {
        this.mc = mc;
    }

    @Override
    public void levelUp() {
        setLife(getLife() + 50);
        setManaAmount(getManaAmount() + 150);
        setLevel(getLevel() + 1);
        setAd(getAd() + 5);
        setAp(getAp() + 15);
    }

    @Override
    public void receivedDamage() {
        if (getLife() <= 15){
            System.out.println("You die !!!");
        } else {
            setLife(getLife() - 15);
            System.out.println("Your mage received 15 damage");
        }
    }

    @Override
    public void heal() {
        if(getLife() < 0){
            System.out.println("Impossible to do this action ,because your mage is dead ");
        } else {
            setLife(getLife() + 50);
            System.out.println("Heal 50 heal points !");
        }
    }

    @Override
    public void bonusAd() {
        setAd(getAd() + 10);
        System.out.println("Your has won 10 of bonus Attack Damage !");
    }

    @Override
    public void bonusAp() {
        System.out.println("Your has won 20 of bonus Ability Power !");
        setAp(getAp() + 20);
    }
}
