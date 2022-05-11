package Laboratory.Lab04.Teste01;

public class CaixaTeste01 {
    public static void main(String[] args) {

        Caixa01<String> caixaA = new Caixa01<>();
        caixaA.guardar("Segredo !!!");
        String coisaA = caixaA.abrir();
        System.out.println(caixaA.abrir());

        Caixa01<Double> caixaB = new Caixa01<>();
        caixaB.guardar(3.1514);
        double coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }

}
