package DevDojoExercicios.Rdatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(5);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(5);
        Period p3 = Period.ofWeeks(39);
        Period p4 = Period.ofMonths(48);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.getChronology());
        System.out.println(p4);
        System.out.println(Period.between(now, now.plusDays(p3.getDays())));
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
