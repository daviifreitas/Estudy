package Lambda.Enuns.Classes;

public class Cliente {

    public enum TipoPagamento{
        AVISTA,APRAZO ;
    }

    private String nome ;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo , TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", Numero = "+ tipoCliente.getTipo()+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
