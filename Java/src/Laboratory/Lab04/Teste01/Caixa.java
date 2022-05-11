package Laboratory.Lab04.Teste01;

public class Caixa {
    private Object coisa ;

    public void guardar(Object coisa){
        this.coisa = coisa ;
    }
    public Object abrir(){
        return this.coisa ;
    }

}
