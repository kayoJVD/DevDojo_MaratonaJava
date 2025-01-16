package DevDojoExercicios.Rdatas.Test;

import java.time.Instant;

public class InstanteTest01 {
    public static void main(String[] args) {
        Instant mow = Instant.now();
        System.out.println(mow);
        System.out.println(mow.getEpochSecond());
        System.out.println(mow.getNano());
    }
}
