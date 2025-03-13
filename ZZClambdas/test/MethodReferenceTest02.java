package DevDojoExercicios.ZZClambdas.test;

import DevDojoExercicios.ZZClambdas.dominio.Anime;
import DevDojoExercicios.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 100), new Anime("One piece", 90), new Anime("Naruto", 500)));
        AnimeComparator animeComparator = new AnimeComparator();
        animeList.sort(animeComparator::compareByEpisosdesNonStatic);
        // animeList.sort((a1,a2) -> animeComparator.compareByEpisosdesNonStatic(a1,a2));
        System.out.println(animeList);

    }
}
