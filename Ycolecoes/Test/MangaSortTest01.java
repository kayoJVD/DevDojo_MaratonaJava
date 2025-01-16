package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9));
        mangas.add(new Manga(4L,"One Piece", 30.99));
        mangas.add(new Manga(1L,"Naruto", 14.50));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-----------------------");
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        mangas.sort(new MangaByIdComparator());
        System.out.println("-----------------------");
        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
