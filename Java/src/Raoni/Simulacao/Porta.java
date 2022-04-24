package Raoni.Simulacao;

public class Porta {
    private boolean aberta ;
    private String cor ;
    private double dimensaoX ;
    private double dimensaoY;
    private double dimensaoZ ;

    public void abrir(){
        this.aberta = true ;
    }

    public void pintar(String cor){
        this.cor =cor ;
    }

    public void estaAberta(){
        System.out.println("A porta está aberta ? " +(this.aberta ? "Sim" : "Não"));
    }

}
