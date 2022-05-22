package Raoni.ExercicioOpcional.Classes;

public abstract class Person {
    private String name ;
    private int life ;
    private int mana ;

    private int dano ;

    Person(String name){
        this.name = name ;
    }

    public void setName(String name ){
        this.name = name ;
    }
    public String getName(){
        return this.name ;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setLife(int life){
        this.life = life ;
    }
    public int getLife(){
        return this.life ;
    }

    public void setMana(int mana){
        this.mana = mana ;
    }
    public int getMana(){
        return this.mana ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", mana=" + mana +
                '}';
    }
}
