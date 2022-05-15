package Laboratory.Lab08.Tester01;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("Qualquer texto");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
            public void imprimeTexto(){
                System.out.println("Qualquer texto que foi sobrescrito");
            }
        };
        anonima.imprimeTexto();
        // Usando Interface
        Texto texto = new Texto(){
            @Override
            public void imprimeTexto() {
                System.out.println("Qualquer texto - interface");
            }
        };
        texto.imprimeTexto();
    }
}
