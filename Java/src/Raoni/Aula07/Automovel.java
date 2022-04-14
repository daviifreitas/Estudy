package Raoni.Aula07;

public class Automovel extends Veiculo{
    private int quantidadeDeMarcas;

    public Automovel(String marca, String modelo, int ano, String cor, String registro, int quantidadeDeMarcas) {
        super(marca, modelo, ano, cor, registro);
        setQuantidadeDeMarcas(quantidadeDeMarcas);
    }

    public int getQuantidadeDeMarcas() {
        return quantidadeDeMarcas;
    }

    public void setQuantidadeDeMarcas(int quantidadeDeMarcas) {
        this.quantidadeDeMarcas = quantidadeDeMarcas;
    }
}
