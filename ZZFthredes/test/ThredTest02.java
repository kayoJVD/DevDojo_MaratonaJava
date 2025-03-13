package DevDojoExercicios.ZZFthredes.test;

class ThreadExample2 extends Thread{
    private char c;
    public ThreadExample2(char c){
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

class TheredExampleRunnable2 implements Runnable{

    private String c;
    public TheredExampleRunnable2(String c){
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
            throw new RuntimeException(e);
        }
    }
}



public class ThredTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TheredExampleRunnable2("KA"));
        Thread t2 = new Thread(new TheredExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
