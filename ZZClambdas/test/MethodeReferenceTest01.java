package DevDojoExercicios.ZZClambdas.test;

import DevDojoExercicios.ZZClambdas.dominio.Anime;
import DevDojoExercicios.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
// Reference to a static method

public class MethodeReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 100), new Anime("One piece", 90), new Anime("Naruto", 500)));
        //Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle())); - METODO COM DUAS CHAMADAS
        //Collections.sort(animeList, (a1, a2) -> AnimeComparator.compareByTitlle(a1, a2)); METODO COM UMA CHAMADA, ESSA PODE SER TROCADA PELO METHOD REFERENCE
        animeList.sort(AnimeComparator::compareByTitlle);
        System.out.println(animeList);
        System.out.println("_--------------");
        animeList.sort(AnimeComparator::compareByEpisosdes);
        System.out.println(animeList);

    }
}
