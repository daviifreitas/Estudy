package Laboratory.Lab09InnerClasses.Test;

public class ClassesLocaisTeste {
    private String nome = "William";

    public void fazAlgumaCoisa(){
        class Interna{
            public void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }
        Interna interna = new Interna();
        interna.imprimeNomeExterno();
    }
    public static void main(String[] args) {
        ClassesLocaisTeste classesLocaisTeste= new ClassesLocaisTeste();
        classesLocaisTeste.fazAlgumaCoisa();
    }
}
