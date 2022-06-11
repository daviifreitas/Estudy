package Laboratory.Lab12.classes;

import Laboratory.Lab12.Interfaces.Geometria;
import Laboratory.Lab12.Interfaces.Retangular;

public class TrianguloRetangulo implements Retangular {
    private int altura;
    private int largura;

    public TrianguloRetangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    @Override
    public boolean sameProportions(Retangular toCompare) {
        return false;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
