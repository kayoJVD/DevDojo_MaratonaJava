package DevDojoExercicios.Rdatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-08-06");
        LocalTime time = LocalTime.parse("19:50:55");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime time1 = date.atTime(time);
        System.out.println(time1);

    }
}
