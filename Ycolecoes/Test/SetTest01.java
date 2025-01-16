package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9,0));
        mangas.add(new Manga(4L,"One Piece", 30.99,5));
        mangas.add(new Manga(1L,"Naruto", 14.50,0));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99,2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00,0));

        mangas.forEach(System.out::println);
    }
}
