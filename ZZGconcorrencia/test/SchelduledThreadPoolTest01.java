package DevDojoExercicios.ZZGconcorrencia.test;

import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


public class SchelduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formater) + " beep");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//        executor.schedule(r, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);

        executor.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 20, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formater));
        beeper();
    }
}
