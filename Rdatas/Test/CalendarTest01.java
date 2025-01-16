package DevDojoExercicios.Rdatas.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.SortedMap;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana ");
        }
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        Date data = c.getTime();
        System.out.println(data);
    }
}
