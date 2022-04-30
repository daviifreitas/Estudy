package Javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Byte byteW = 1;
        Short shrotW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1f ;
        Double doubleW = 100d;
        Character charW = 'w';
        Boolean booleanW = false ;

        Integer intw2 = Integer.parseInt("1");
        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toLowerCase('a'));
    }
}
