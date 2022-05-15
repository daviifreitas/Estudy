package CursoAlura.POO.Aula01.Classes;

public class TesteContas {
    public static void main(String[] args) {
        Conta conta = new Conta(1337 ,2334);
        conta.deposito(200.);
        System.out.println(conta.getSaldo());

        conta.setAgencia(570);

        System.out.println(conta.getAgencia());

        System.out.println("O total de contas e : "+Conta.getTotal());
    }
}
