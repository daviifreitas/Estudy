package Lambda.Npolimorfismo.Classes;

public class Gerente extends Funcionario{
    private double pn1 ;
    public Gerente(String nome, double salario , double pn1) {
        super(nome, salario);
        this.pn1 = pn1;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pn1 ;
    }

    public double getPn1() {
        return pn1;
    }

    public void setPn1(double pn1) {
        this.pn1 = pn1;
    }
}
