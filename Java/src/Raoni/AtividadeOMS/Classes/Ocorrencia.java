package Raoni.AtividadeOMS.Classes;

public class Ocorrencia {
    private String descricaoAssaltante ;
    private int idDeQuemRealizou;
    private double longitude ;
    private double latitude ;

    public Ocorrencia(String descricaoAssaltante, int idDeQuemRealizou, double longitude, double latitude) {
        this.descricaoAssaltante = descricaoAssaltante;
        this.idDeQuemRealizou = idDeQuemRealizou;
        this.longitude = longitude;
        this.latitude = latitude;
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
