package DevDojoExercicios.ZZAclassesInternas.test;

import DevDojoExercicios.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class BarcoNameComparator implements Comparator<Barco>{
//    @Override
//    public int compare(Barco o1, Barco o2) {
//        return o1.getNome().compareTo(o1.getNome());
//    }
//}

public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha do R10"), new Barco("Lancha Neymar")));
        // barcos.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcos);
    }
}
