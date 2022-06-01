package CursoAlura.EstruturaDeDados.AdapterArrays.Tester;

import CursoAlura.EstruturaDeDados.AdapterArrays.Classes.Conta;
import CursoAlura.EstruturaDeDados.AdapterArrays.Classes.GuardadorDeContas;

public class Tester01 {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new Conta();
        guardador.adiconarConta(cc);

        Conta cc2 = new Conta();
        guardador.adiconarConta(cc2);

        int tamanho = guardador.getQuantidadeDeElemenos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getId());
    }
}
