package Laboratory.Lab09InnerClasses.Test;
class Externa{
    static class Interna{
        public void imprimir(){
            System.out.println("Oi");
        }
    }
}
class Externa02 {
    class Interna02 {
        public void fazerUmTeste(){
            System.out.println("Fazendo um teste !!!!");
        }
    }
}
public class ClassesInternasEstaticasTeste {

    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
        Interna2 teste2 = new Interna2();
        teste2.imprimir();
        Externa02 externa02 = new Externa02();
        Externa02.Interna02 interna02 = externa02.new Interna02();
    }
    static class Interna2{
        public void imprimir(){
            System.out.println("Dentro do interna 2");
        }
    }
}
