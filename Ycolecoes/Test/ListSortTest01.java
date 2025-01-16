package DevDojoExercicios.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hunter X Hunter");
        mangas.add("One Piece");
        mangas.add("Naruto");
        mangas.add("Demon Slayer");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas); // Poe a lista em ordem alfabetica ou em 0 - 9 em dinheiro

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100D);
        dinheiros.add(75D);
        dinheiros.add(15.65);
        dinheiros.add(1574.65);
        dinheiros.add(11.43);

        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
