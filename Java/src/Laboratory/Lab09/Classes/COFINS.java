package Laboratory.Lab09.Classes;

import Laboratory.Lab09.Interfaces.Imposto;

public class COFINS implements Imposto {

    @Override
    public double calcularImposto(double value) {
        if(value > 12000){
            return value * 0.04 ;
        } else {
            return 0 ;
        }
    }
}
