package Javacore.ZZFThreads.test;


class ThreadExample extends Thread{
    private char c ;

    public ThreadExample(char c){
        this.c = c ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(c);
            if(i %1000 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {

    private final char c ;

    public ThreadExampleRunnable (char c){
        this. c = c ;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i %1000 == 0){
                System.out.println();
            }
        }
    }
}

//Daemon -> Não tem tanta prioridade x User -> Os processos acabam quando todas as threads acabam
// pode executar em paralelo
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable( 'D'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
