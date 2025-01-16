package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Consumidor;
import DevDojoExercicios.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Kayo");
        Consumidor consumidor2 = new Consumidor("Kayk");
        System.out.println(consumidor2);

        Manga manga1 = new Manga(5L,"Hunter X Hunter", 19.9);
        Manga manga2 = new Manga(4L,"One Piece", 30.99);
        Manga manga3 = new Manga(1L,"Naruto", 14.50);
        Manga manga4 = new Manga(2L, "Demon Slayer", 25.99);
        Manga manga5 = new Manga(3L, "Dragon Ball Z", 20.00);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga4);
        consumidorMangaMap.put(consumidor2, manga5);
        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() +" Comprou: " + entry.getValue().getNome());
        }
    }
}
