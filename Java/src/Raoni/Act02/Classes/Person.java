package Raoni.Act02.Classes;

import Raoni.Act02.Interfaces.Comands;

public abstract class Person implements Comands {
    private int level;
    private String name ;
    private int life;
    private int manaAmount;
    private String guild ;
    private int ad ; // AD means attack damage
    private int ap ; // AP means ability power
    private int levelOfAbilities;

    public Person(String name) {
        this.name = name;
    }

    public void status(){};

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getManaAmount() {
        return manaAmount;
    }

    public void setManaAmount(int manaAmount) {
        this.manaAmount = manaAmount;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getLevelOfAbilities() {
        return levelOfAbilities;
    }

    public void setLevelOfAbilities(int levelOfAbilities) {
        this.levelOfAbilities = levelOfAbilities;
    }
}
