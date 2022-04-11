package Lambda.LClassesAbstratas.Test;

import Lambda.LClassesAbstratas.Classes.Funcionario;
import Lambda.LClassesAbstratas.Classes.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna","11222-2",2000);

        g.calculaSalario();
        System.out.println(g);

    }
}
