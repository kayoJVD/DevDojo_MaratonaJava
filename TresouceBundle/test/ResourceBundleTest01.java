package DevDojoExercicios.TresouceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle1.getString("Hello"));
        System.out.println(bundle1.getString("good.morning"));

        //Locale ("fr", "CA");
        //Locale_fr_CA.properties
        //messages_fr.properties
        //messages_en.US.properties
    }
}
