package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9));
        mangas.add(new Manga(4L,"One Piece", 30.99));
        mangas.add(new Manga(1L,"Naruto", 14.50));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00));

        //Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga demonSlayer = new Manga(2L, "Demon Slayer", 25.99);
        System.out.println(Collections.binarySearch(mangas, demonSlayer, new MangaByIdComparator()));
    }

}
