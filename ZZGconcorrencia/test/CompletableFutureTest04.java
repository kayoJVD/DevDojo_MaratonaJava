package DevDojoExercicios.ZZGconcorrencia.test;

import DevDojoExercicios.ZZGconcorrencia.dominio.Quote;
import DevDojoExercicios.ZZGconcorrencia.service.StoreServiceWhitDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWhitDiscount service = new StoreServiceWhitDiscount();
        searchPriceWhitDiscountAsync(service);
    }

    private static void searchPriceWhitDiscount(StoreServiceWhitDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        // stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) // store:price:code
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }

    // AULA 244, CONCORRÊNCIA PT 16


    private static void searchPriceWhitDiscountAsync(StoreServiceWhitDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> completableFutures = stores.stream()
                // Gettin the price async storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                // Instantiating a new Quote from the string gererated by getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // Composing the firs completable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote)))).
                collect(Collectors.toList());

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end-start));
    }
}
