package Laboratory.Lab09.Teste;

import Laboratory.Lab09.Classes.COFINS;
import Laboratory.Lab09.Classes.ICMS;
import Laboratory.Lab09.Classes.IPI;

public class Tester01 {
    public static void main(String[] args) {
        ICMS icms = new ICMS();
        COFINS cofins = new COFINS();
        IPI  ipi = new IPI();
        System.out.println("Value of ICMS : "+ icms.calcularImposto(12000));
        System.out.println("Value of COFINS : "+cofins.calcularImposto(12000));
        System.out.println("Value of IPI : "+ipi.calcularImposto(12000));

        double sigma = 0 ;
        sigma += icms.calcularImposto(12000);
        sigma += cofins.calcularImposto(12000);
        sigma += ipi.calcularImposto(12000);

        System.out.println("The summation is : "+sigma);
    }
}
