package DevDojoExercicios.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Luffy", "Sanji", "Zoro", "Kayo");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings,  t -> System.out.println(t));
        forEach(integers, t -> System.out.println(t));
    }
    private static <T> void  forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }

}
