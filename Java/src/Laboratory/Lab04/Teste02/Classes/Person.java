package Laboratory.Lab04.Teste02.Classes;

import Laboratory.Lab04.Teste02.Interfaces.Actions;

public class Person implements Actions {

    private int age ;
    private String name ;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The person is running ...");
    }

    @Override
    public void birthDay() {
        System.out.println("Happy birth day !!!!!\n\nCongratulations !");
        setAge(getAge() + 1);
    }

    @Override
    public void jump() {
        System.out.println("Only a big jump :)");
    }
}
