package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9,0));
        mangas.add(new Manga(4L,"One Piece", 30.99,5));
        mangas.add(new Manga(1L,"Naruto", 14.50,0));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99,2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00,0));

//        Iterator<Manga> mangaIterator   = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
//        System.out.println(mangas);
        mangas.forEach(System.out::println);
    }
}
