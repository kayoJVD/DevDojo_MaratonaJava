package DevDojoExercicios.ZZDoptional.repositorio;

import DevDojoExercicios.ZZDoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Solo leving", 45));

    private static  Optional<Manga> findyBy (Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findyByTitle(String title){
        return findyBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findyById_(Integer id){
        return findyBy(m -> m.getId().equals(id));
    }
}
