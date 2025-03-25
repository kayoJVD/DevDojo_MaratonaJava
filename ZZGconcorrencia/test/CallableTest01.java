package DevDojoExercicios.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executandp uma tarefa callable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), count);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws Exception {
        RandomNumberCallable rd = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(rd);
        String s = future.get();
        System.out.printf("Programa finished %s%n",s);
        executorService.shutdown();
    }
}
