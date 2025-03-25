package DevDojoExercicios.ZZGconcorrencia.test;

import DevDojoExercicios.ZZGconcorrencia.dominio.Quote;
import DevDojoExercicios.ZZGconcorrencia.service.StoreServiceWhitDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWhitDiscount service = new StoreServiceWhitDiscount();
        searchPriceWhitDiscountAsync(service);
    }

    private static void searchPriceWhitDiscountAsync(StoreServiceWhitDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s fineshd in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        //CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Fineshed? %b ", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }
}
