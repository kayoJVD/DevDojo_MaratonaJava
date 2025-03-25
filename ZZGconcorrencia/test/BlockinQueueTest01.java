package DevDojoExercicios.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockinQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Kayo");
        System.out.printf("%s add the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("trying to add another value");
        new Thread(new RemoveFromQueu(bq)).start();
        bq.put("Alves");
        System.out.printf("%s add the value %s", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueu implements Runnable{
        private final BlockingQueue<String> bq;

        RemoveFromQueu(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
