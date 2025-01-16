package DevDojoExercicios.Sformatacao.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Locale utiliza dois tipos de padrão, Language e country
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("Ialia: "+df3.format(calendar.getTime()));
        System.out.println("Brasil: "+df2.format(calendar.getTime()));
        System.out.println("Suiça: "+df1.format(calendar.getTime()));

        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeBrasil.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
    }
}
