package DevDojoExercicios.ZZFthredes.test;

class ThreadExample extends Thread{
    private char c;
    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class TheredExampleRunnable implements Runnable{

    private char c;
    public TheredExampleRunnable(char c){
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// Daemon X User o Java encerra o programa quando todos as User são finalizadas, a Daemon não importa tanto

public class ThredTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new TheredExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new TheredExampleRunnable('B'), "T1B");
        Thread t3 = new Thread(new TheredExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new TheredExampleRunnable('D'), "T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
