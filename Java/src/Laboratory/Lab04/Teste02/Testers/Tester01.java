package Laboratory.Lab04.Teste02.Testers;

import Laboratory.Lab04.Teste02.Classes.Person;
import Laboratory.Lab04.Teste02.Classes.PoliceMan;
import Laboratory.Lab04.Teste02.Interfaces.Actions;

public class Tester01 {
    public static void main(String[] args) {
        Person p1 = new Person(22,"Jose");

        PoliceMan pm = new PoliceMan("Josiclaúdio",12, 55 );

        if(pm instanceof Actions){
            System.out.println("The real ");
        }
        if(p1 instanceof Actions){
            System.out.println("Done !!!!");
        }
    }
}
