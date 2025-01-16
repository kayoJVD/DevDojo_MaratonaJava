package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1A245SB", "XIAOMI");
        Smartphone s2 = new Smartphone("22222", "XIAOMI");
        Smartphone s3 = new Smartphone("3333", "SAMSUNG");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        //smartphones.clear(); limpa os valores das variaves

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("3333", "SAMSUNG");
        smartphones.add(s4);

        System.out.println(smartphones.contains(s4));
        int indexSmartphone = smartphones.indexOf(s4);
        System.out.println(indexSmartphone);
    }
}
