package DevDojoExercicios.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenration();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenration);
    }

    public CompletableFuture<Double> getPricesAsyncCompletedFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenration);
    }

    private double priceGenration(){
        System.out.printf("%s generation price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
