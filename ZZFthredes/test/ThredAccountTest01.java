package DevDojoExercicios.ZZFthredes.test;

import DevDojoExercicios.ZZFthredes.dominio.Account;

public class ThredAccountTest01 implements Runnable{
    private final Account account = new Account();
    public static void main(String[] args) {
        ThredAccountTest01 thredAccountTest01 = new ThredAccountTest01();
        Thread t1 = new Thread(thredAccountTest01, "Hestia");
        Thread t2 = new Thread(thredAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(6);
            if (account.getBalance() < 0){
                System.out.println("FODEO");
            }
        }
    }

    private void withdrawal(int amount){
        System.out.println(getThreadName() + " ####fora do synchronized");
        synchronized (account){
            System.out.println(getThreadName() + " ****dentro do synchronized");
            if (account.getBalance() >= amount){
                System.out.println(getThreadName() + " esta indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " compleetou o saque, valor atual da conta " + account.getBalance());
            }else {
                System.out.println("Sem dinhero para " + getThreadName() + " efetuar o saque"+account.getBalance());
            }
        }

    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
