package Laboratory.Lab09InnerClasses.Test;

public class InnerClassesTest01 {
    private String nome = "William Jedi do DevDojo";
    class Interna{
        public void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(InnerClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        InnerClassesTest01 externa = new InnerClassesTest01();
        Interna interna = externa.new Interna();
        InnerClassesTest01.Interna interna1 = new InnerClassesTest01().new Interna();
        interna.verClasseExterna();
    }
}

