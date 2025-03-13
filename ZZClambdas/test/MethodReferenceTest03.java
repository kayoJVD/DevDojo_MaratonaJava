package DevDojoExercicios.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInterger = Integer::parseInt;
        System.out.println(numStringToInterger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Veldora"));
    }
}
