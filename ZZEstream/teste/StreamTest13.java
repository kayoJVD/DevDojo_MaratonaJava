package DevDojoExercicios.ZZEstream.teste;

import DevDojoExercicios.ZZEstream.dominio.Category;
import DevDojoExercicios.ZZEstream.dominio.LightNovel;
import DevDojoExercicios.ZZEstream.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static DevDojoExercicios.ZZEstream.dominio.Promotion.NORMAL_PRICE;
import static DevDojoExercicios.ZZEstream.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlod", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> promotionListMap = lightNovels.stream().collect(groupingBy(ln ->
                ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
        ));
        System.out.println(promotionListMap);
        // Map<Category, ap<Promotion, List<LightNovel>>>
        System.out.println("---------");

        Map<Category, Map<Promotion, List<LightNovel>>> categoryMapMap = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));
        System.out.println(categoryMapMap);
    }
}
