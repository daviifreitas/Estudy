package Omega.Cursoo;

public class A01 {
    public static void main(String[] args) {
        Calculo calc = (x ,y) -> {return x + y ;}; // maneira composta de fazer a mesma coisa 

        calc = (x ,y) -> x * y; // Maneira bem simples para fazer a questão de interfaces funcionais 

        System.out.println(calc.executar(9, 10));

        System.out.println(calc.legal());

        System.out.println(Calculo.muitoLegal());
    }
}
