package DevDojoExercicios.Rdatas.Test.Exercicios.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiferencaDatas {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1998, 5, 26);
        LocalDate localDate1 = LocalDate.now();

        long diasDiferenca = ChronoUnit.DAYS.between(localDate, localDate1);
        System.out.println("Diferenças em dias é: " + diasDiferenca);
    }
}
