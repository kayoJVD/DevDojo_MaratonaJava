package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Consumidor;
import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9,0));
        mangas.add(new Manga(4L,"One Piece", 30.99,5));
        mangas.add(new Manga(1L,"Naruto", 14.50,0));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99,2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00,0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
