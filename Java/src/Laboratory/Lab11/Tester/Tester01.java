package Laboratory.Lab11.Tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester01 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Warren Buffett", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person ("Bill Gtes",100));
        people.add(new Person("Mark Zuckerberg",50));

        List<Person> collect = people.stream().filter(person -> person.getBillions() >= 100).collect(Collectors.toList());
        System.out.println(collect);

        List<Person> namesSorted = people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        System.out.println(namesSorted);
    }
}
class Person{
    private String name;
    private int billions ;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", billions=" + billions +
                '}';
    }

    public Person(String name , int billions){
        this.name = name ;
        this.billions = billions ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }
}
