package Raoni.Aula07;

public class Aeronave extends Veiculo{
    private int alguraVoo;

    public Aeronave(String marca, String modelo, int ano, String cor, String registro, int alturaVoo) {
        super(marca, modelo, ano, cor, registro);
        setAlguraVoo(alturaVoo);
    }

    public int getAlguraVoo() {
        return alguraVoo;
    }

    public void setAlguraVoo(int alguraVoo) {
        this.alguraVoo = alguraVoo;
    }
}
