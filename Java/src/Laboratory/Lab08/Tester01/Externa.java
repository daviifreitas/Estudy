package Laboratory.Lab08.Tester01;

public class Externa {
    private String texto = "Texto externo";

    public class Interna{
        private String texto = "Texto interno";

        public void imprimeTexto(){
            System.out.println(texto);

            //consegue ver menbros da classe externa
            System.out.println(new Externa().texto);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();
        interna.imprimeTexto();
    }
}
