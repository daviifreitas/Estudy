package Laboratory.Lab09.Classes;

import Laboratory.Lab09.Interfaces.Imposto;

public class ICMS implements Imposto {

    @Override
    public  double calcularImposto(double value) {
        return value * 0.24;
    }
}
