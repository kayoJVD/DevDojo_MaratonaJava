package DevDojoExercicios.Rdatas.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.OCTOBER, 22);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(date.isLeapYear());
    }
}
