package DevDojoExercicios.ZZClambdas.test;

import DevDojoExercicios.ZZClambdas.dominio.Anime;
import DevDojoExercicios.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparators = AnimeComparator::new;
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserker", 100), new Anime("One piece", 90), new Anime("Naruto", 500)));
        AnimeComparator animeComparator = newAnimeComparators.get();

        animeList.sort(animeComparator::compareByEpisosdesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("HxH", 36));
    }
}
