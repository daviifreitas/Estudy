package CursoAlura.POO.Aula01.Classes;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero ;
    private Cliente titular;
    private static int total = 0 ;

    public Conta(int agencia, int numero) {
        Conta.total++;
        setAgencia(agencia);
        setNumero(numero);
        setSaldo(100);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando a conta de número : " + getNumero());
    }
    public void deposito(double valor){
        setSaldo(getSaldo()+valor);
    }
    public void sacar(double valor){
        if(valor >getSaldo()){
            System.out.println("Impossível efetuar esse saque ,pois o valor que você deseja sacar é maior do que o disponível na conta !!!");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Efetuando o saque de "+valor +"\nValor disponível "+getSaldo());
        }
    }

    public boolean transfere(double valor ,Conta destino){
        if(this.saldo >= valor){
            destino.deposito(valor);
            return true ;
        }
        return false ;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
