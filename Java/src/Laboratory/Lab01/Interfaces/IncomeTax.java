package Laboratory.Lab01.Interfaces;

import Laboratory.Lab01.Classes.Functionary;
import Laboratory.Lab01.Classes.Principal;
import Laboratory.Lab01.Classes.Teacher;

public interface IncomeTax {
    public static void calculateIncomeTax(Functionary funcionario){

        System.out.println("Calculating the income tax "+funcionario.getName());
        System.out.println("Salary : "+funcionario.getSalary());

        if(funcionario instanceof Teacher){
            double incomeTax = (funcionario.getSalary()*12) * 0.05;
            System.out.println("The teacher income tax is  : "+incomeTax+" $ dollars ");
        }

        else if (funcionario instanceof Principal){
            double incomeTax = (funcionario.getSalary()*12)*0.1;
            System.out.println("The income tax which will for principal's people is :" +incomeTax +" in dollars ");
        }
    }
}
