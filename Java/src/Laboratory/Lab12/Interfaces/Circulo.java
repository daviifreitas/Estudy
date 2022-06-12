package Laboratory.Lab12.Interfaces;

import Laboratory.Lab12.Interfaces.Geometria;

public class Circulo implements Geometria {
    private int raio ;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public float getPerimetro() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }
}
