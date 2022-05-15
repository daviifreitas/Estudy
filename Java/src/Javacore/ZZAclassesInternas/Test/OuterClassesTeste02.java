package Javacore.ZZAclassesInternas.Test;
// classes locais !!!!
public class OuterClassesTeste02 {
    private String name = "Midoriya ";
    void print(){
        String lastName = "Izuku";

        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTeste02 outerClassesTeste02 = new OuterClassesTeste02();
        outerClassesTeste02.print();
    }
}
