package Javacore.ZZAclassesInternas.Test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Lufft";

    // nested classes
    class Inner{
        public void printOuterClsseAttribute(){
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 t1 = new OuterClassesTest01();
        Inner inner = t1.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClsseAttribute();
        inner2.printOuterClsseAttribute();
    }
}
