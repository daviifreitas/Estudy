package Laboratory.Lab05.Classes;

public class Carro implements Revisar{
    private String modelo ;
    private String marca;
    private double valor;

    public Carro(String modelo, String marca, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
