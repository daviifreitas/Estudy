package Laboratory.Lab03.Teste;

public class Teste01 {
    public static void main(String[] args) {
        new Thread(t1).start();
        t1.run();
        new Thread(t2).start();
        t2.run();
    }
    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Fazendo um teste de como fazer Threads");
            }
        }
    };
    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Fazendo um teste no thread 2 ");
            }
        }
    };
}
