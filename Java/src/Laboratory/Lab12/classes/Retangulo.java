package Laboratory.Lab12.classes;

import Laboratory.Lab12.Interfaces.GeometriaRetangular;
import Laboratory.Lab12.Interfaces.Retangular;

public class Retangulo implements GeometriaRetangular {

    private int altura ;
    private int largura ;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getAltura() {
        return 0;
    }

    @Override
    public int getLargura() {
        return 0;
    }

    @Override
    public boolean sameProportions(Retangular toCompare) {
        return false;
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
