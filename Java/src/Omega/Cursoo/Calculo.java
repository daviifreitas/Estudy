package Omega.Cursoo;

@FunctionalInterface
public interface Calculo {
    double executar(int x ,int y);

    default String legal(){
        return "Legal";
    }

    static String muitoLegal(){
        return "Muito Legal";
    }
}
