package Laboratory.Lab09.Classes;

import Laboratory.Lab09.Interfaces.Imposto;

public class IPI implements Imposto {

    @Override
    public double calcularImposto(double value) {
        if(value < 2000){
            return value * 0.05;
        } else {
            return value * 0.11 ;
        }
    }
}
