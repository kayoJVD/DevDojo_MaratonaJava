package DevDojoExercicios.Wnio.test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class teste {
    public static void main(String[] args) {
        // Obter a data e hora atual no fuso horário UTC
        OffsetDateTime utcNow = OffsetDateTime.now(ZoneOffset.UTC);

        // Exibir o horário atual em UTC
        System.out.println("Data e hora no UTC: " + utcNow);
    }
}
