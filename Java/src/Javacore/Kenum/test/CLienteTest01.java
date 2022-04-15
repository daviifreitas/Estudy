package Javacore.Kenum.test;


import Javacore.Kenum.dominio.Cliente;
import Javacore.Kenum.dominio.TipoCliente;

public class CLienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.relatorio);
        TipoCliente tipoCliente1 = TipoCliente.tipoCLientePornomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente1);
    }
}
