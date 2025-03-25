package DevDojoExercicios.ZZGconcorrencia.test;

import DevDojoExercicios.ZZGconcorrencia.service.StoreService;
import DevDojoExercicios.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }
    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .collect(Collectors.toList());
        for (Double price : collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList())) {
            System.out.println(price);
        }


        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));

    }
}
