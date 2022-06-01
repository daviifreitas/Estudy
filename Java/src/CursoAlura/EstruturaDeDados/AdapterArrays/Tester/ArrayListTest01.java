package CursoAlura.EstruturaDeDados.AdapterArrays.Tester;


import CursoAlura.EstruturaDeDados.AdapterArrays.Classes.Conta;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc  = new Conta();
        lista.add(cc);

        Conta cc2 = new Conta();
        lista.add(cc2);

        Conta ref = (Conta) lista.get(0);

        System.out.println();
    }
}
