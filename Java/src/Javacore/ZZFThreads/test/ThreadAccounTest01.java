package Javacore.ZZFThreads.test;

import Javacore.ZZFThreads.dominio.Account;

public class ThreadAccounTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {

        ThreadAccounTest01 threadAccounTest01 = new ThreadAccounTest01();
        Thread t1 = new Thread(threadAccounTest01 , "Hestia");
        Thread t2 = new Thread(threadAccounTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    private  void withdrawal(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta "+ account.getBalance());
        } else {
            System.out.println("Sem dinheiro para "+ Thread.currentThread().getName() + " efetuar o saque "+account.getBalance());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0){
                System.out.println("FODEO");
            }
        }
    }
}
