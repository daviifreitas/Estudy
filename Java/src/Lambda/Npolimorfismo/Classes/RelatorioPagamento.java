package Lambda.Npolimorfismo.Classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome : "+funcionario.getNome());
        System.out.println("Salário : "+funcionario.getSalario());
        if(funcionario instanceof Gerente ){
            System.out.println("Participação nos lucros : "+((Gerente) funcionario).getPn1());
        }
        else if (funcionario instanceof Vendedor){
            System.out.println("Total vendas : "+((Vendedor) funcionario).getTotalVendas());
        }
    }
}
