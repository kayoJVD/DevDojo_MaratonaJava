package DevDojoExercicios.ZZClambdas.service;

import DevDojoExercicios.ZZClambdas.dominio.Anime;

public class AnimeComparator {
    public static int compareByTitlle (Anime a1,Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisosdes (Anime a1,Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public  int compareByEpisosdesNonStatic (Anime a1,Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
