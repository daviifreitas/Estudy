package Omega.Cursoo.Lambda;

public class Person {
    private final String name ;
    private final int age;
    private final Gender gender;

    public Person(String name ,int age ,Gender gender){
        this.name = name;
        this.gender = gender ;
        this.age = age ;
    }

    public String getName(){return this.name;}

    public int getAge(){return this.age;}

    public Gender getGender(){return this.gender;}

    @Override
    public String toString(){
        return "Person{\nName : "+name+"\nAge : "+age+"\nGender :"+gender+":}";
    }
    
}
