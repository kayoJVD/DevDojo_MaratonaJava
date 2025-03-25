package DevDojoExercicios.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Kayo"));
        System.out.println(tq.offer("Kayo"));
        System.out.println(tq.offer("Kayo", 10, TimeUnit.SECONDS));
        tq.put("Dev Java");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Dev Java");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
    }
}
