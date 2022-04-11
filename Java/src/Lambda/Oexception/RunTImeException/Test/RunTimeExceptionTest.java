package Lambda.Oexception.RunTImeException.Test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch(RuntimeException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void divisao(int num1 ,int num2 ){
        if(num2 == 0 ){
            throw new IllegalArgumentException("Passe um valor diferente de zero para num2 ");
        }
        int result = num1 / num2 ;
    }
}
