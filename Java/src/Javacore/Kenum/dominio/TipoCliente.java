package Javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica ");

    public final int valor ;
    public final String relatorio;

    TipoCliente(int valor, String relatorio) {
        this.valor = valor;
        this.relatorio= relatorio;
    }
    public static TipoCliente tipoCLientePornomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente: values()) {
            if(tipoCliente.relatorio.equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null ;
    }
}
