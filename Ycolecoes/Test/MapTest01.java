package DevDojoExercicios.Ycolecoes.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Teklado", "teclado");
        map.put("vc", "você");
        map.put("Ozasco", "Osasco");
        System.out.println(map);
        for (String key : map.keySet()){
            System.out.println(key +": " + map.get(key));
        }
        System.out.println("--------------------------------");

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
