package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Manga;
import DevDojoExercicios.Ycolecoes.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmatPhoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest0 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmatPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Iphone");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Hunter X Hunter", 19.9,0));
        mangas.add(new Manga(4L,"One Piece", 30.99,5));
        mangas.add(new Manga(1L,"Naruto", 14.50,0));
        mangas.add(new Manga(2L, "Demon Slayer", 25.99,2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 20.00,0));
        Manga bleach = new Manga(6L, "Bleach", 15.96, 6);


        /*
        lower(E e): Retorna o maior elemento estritamente menor que e.
        floor(E e): Retorna o maior elemento menor ou igual a e.
        ceiling(E e): Retorna o menor elemento maior ou igual a e.
        higher(E e): Retorna o menor elemento estritamente maior que e.
        descendingSet(): Retorna uma visão dos elementos na ordem inversa.
p       ollFirst() e pollLast(): Removem e retornam o menor e o maior elemento, respectivamente.
         */
        System.out.println("--------------------");
        System.out.println(mangas.lower(bleach));
        System.out.println("--------------------");
        System.out.println(mangas.descendingSet());
        System.out.println("--------------------");
        System.out.println(mangas.higher(bleach));
    }

}
