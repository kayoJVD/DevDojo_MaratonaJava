package DevDojoExercicios.Rdatas.Test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
       System.out.println(ZoneId.systemDefault());
        ZoneId australiaZone = ZoneId.of("Australia/Sydney");
        System.out.println(australiaZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zone = now.atZone(australiaZone);
        System.out.println(zone);

        Instant nowInstante = Instant.now();
        System.out.println(nowInstante);
        ZonedDateTime zone1 = nowInstante.atZone(australiaZone);
        System.out.println(zone1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
