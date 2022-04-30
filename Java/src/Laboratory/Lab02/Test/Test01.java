package Laboratory.Lab02.Test;

import Laboratory.Lab02.Classes.Person;
import Laboratory.Lab02.Classes.PersonCompareCpf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Joao",5250515151L,1));
        personList.add(new Person("Maria",44541841814L,5));
        personList.add(new Person("Jose",12354154L,2));
        personList.add(new Person("Francisca",2515814854L,4));
        personList.add(new Person("Madalena",588848454L,3));
        Collections.sort(personList);

        System.out.println("With the simple implements method of compare ");

        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("-----------------------------------------------------------------");

        System.out.println("The compare to the Cpfs");

        personList.sort(new PersonCompareCpf());
    }

}
