package Laboratory.Lab04.Teste01;

public class Caixa01 <T> {
    private T coisa ;

    public void guardar(T coisa){
        this.coisa = coisa ;
    }
    public T abrir(){
        return this.coisa;
    }
}
