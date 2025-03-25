package DevDojoExercicios.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenration();
    }



    private double priceGenration(){
        System.out.printf("%s generation price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }



    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
