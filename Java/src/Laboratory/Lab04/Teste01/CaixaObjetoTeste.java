package Laboratory.Lab04.Teste01;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        Caixa caixaA = new Caixa();
        caixaA.guardar(2.3); //double --> Double (autoBox)

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        Caixa caixaB = new Caixa();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
