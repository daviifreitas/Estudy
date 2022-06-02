package Raoni.AtividadeOMS.Classes;

import java.util.Random;

public class Ocorrencia {
    private String descricaoAssaltante ;
    private int idDeQuemRealizou;
    private double longitude ;
    private double latitude ;
    private int numeroDaOcorrencia ;


    public Ocorrencia(String descricaoAssaltante, int idDeQuemRealizou, double longitude, double latitude) {
        this.descricaoAssaltante = descricaoAssaltante;
        this.idDeQuemRealizou = idDeQuemRealizou;
        this.longitude = longitude;
        this.latitude = latitude;
        Random gerarNumeroAleatorio = new Random();
        this.numeroDaOcorrencia = gerarNumeroAleatorio.nextInt(100000000);
    }

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "descricaoAssaltante='" + descricaoAssaltante + '\'' +
                ", idDeQuemRealizou=" + idDeQuemRealizou +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
