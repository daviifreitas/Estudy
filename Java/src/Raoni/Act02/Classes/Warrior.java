package Raoni.Act02.Classes;

import Raoni.Act02.Enums.WarriorClass;
import Raoni.Act02.Interfaces.Comands;

public class Warrior extends Person implements Comands {
    private String weapon ;
    private int levelOfweapon;
    private String armor;
    private int levelOfArmor;
    private WarriorClass wc ;

    public Warrior(String name, String weapon, String armor, int levelOfArmor, WarriorClass wc) {
        super(name);

        this.weapon = weapon;
        this.armor = armor;
        this.levelOfArmor = levelOfArmor;
        this.wc = wc ;

        setLevel(1);
        setLife(250); //  from setters, we see the single attributes for initial warrior objects , imagine the creator of
        setLevelOfArmor(1); // new characters in the simple game of RPG , if you create a new  character , he will have all attributes level 1
        setManaAmount(100);
        setAd(125);
        setAp(30);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "weapon='" + weapon + '\'' +
                ", levelOfweapon=" + levelOfweapon +
                ", armor='" + armor + '\'' +
                ", levelOfArmor=" + levelOfArmor +
                ", wc=" + wc +
                '}';
    }

    @Override
    public void status() {
        System.out.printf("\nClass : %s\nName : %s\nLife : %d\nMana : %d\nAbility Power : %d\nAttack Damage : %d\nLevel : %d",
                getWc(), getName() ,getLife() ,getManaAmount() ,getAp() ,getAd() ,getLevel());
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getLevelOfweapon() {
        return levelOfweapon;
    }

    public void setLevelOfweapon(int levelOfweapon) {
        this.levelOfweapon = levelOfweapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getLevelOfArmor() {
        return levelOfArmor;
    }

    public void setLevelOfArmor(int levelOfArmor) {
        this.levelOfArmor = levelOfArmor;
    }

    public WarriorClass getWc() {
        return wc;
    }

    public void setWc(WarriorClass wc) {
        this.wc = wc;
    }

    @Override
    public void levelUp() {
        System.out.println("Congratulations !!!");
        setLevel(getLevel() + 1);
        setAd(getAd() + 20);
        setAp(getAp() + 5);
        setLife(getLife() + 300);
        setManaAmount(getManaAmount() + 50);
    }

    @Override
    public void receivedDamage() {
        if(getLife() < 15){
            System.out.println("You Die !!!");
        } else {
            System.out.println("You received 15 of damage ");
            setLife(getLife() - 15);
        }
    }

    @Override
    public void heal() {
        System.out.println("You heal 50% of life ");
        setLife(getLife() + (getLife()/2));
    }

    @Override
    public void bonusAd() {
        System.out.println("Your won attack damage bonus !!!");
        setAd(getAd() + 15);
    }

    @Override
    public void bonusAp() {
        System.out.println("You received ability power bonus!");
        setAp((getAp() + 5));
    }
}
