package Lambda.Enuns.Classes;

public enum TipoCliente {
    //Constant specific class body

    PESSOA_FISICA(1, "Pessoa física") , PESSOA_JURIDICA(2,"Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private String nome ;
    private int tipo ;

    TipoCliente(int tipo , String nome) {
        this.tipo = tipo;
        this.nome = nome ;
    }

    //Corpo de classe específico constante

    public String getId(){
        return "a";
    }

    public int getTipo(){
        return tipo ;
    }

    public String getNome(){
        return nome ;
    }
}
