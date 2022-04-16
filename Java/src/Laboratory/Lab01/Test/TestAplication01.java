package Laboratory.Lab01.Test;

import Laboratory.Lab01.Classes.Functionary;
import Laboratory.Lab01.Classes.Principal;
import Laboratory.Lab01.Classes.Teacher;
import Laboratory.Lab01.Interfaces.IncomeTax;

public class TestAplication01 {
    public static void main(String[] args) {
        Functionary functionary = new Teacher("Joao","1235841848",4300);
        Functionary functionary1 = new Principal("Maria","586215151",7800);
        IncomeTax.calculateIncomeTax(functionary);
        System.out.println("-----------------------------");
        IncomeTax.calculateIncomeTax(functionary1);
    }
}
