package Lambda.Gassociacao.test;

import Lambda.Gassociacao.domini.Escola;
import Lambda.Gassociacao.domini.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
