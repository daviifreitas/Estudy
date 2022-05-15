package Javacore.ZZAclassesInternas.Test;

public class OuterClassesTest03 {
    private String name = "Davi";
    private String lastName = "Freitas";

    static class Nested{
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + new OuterClassesTest03().lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
