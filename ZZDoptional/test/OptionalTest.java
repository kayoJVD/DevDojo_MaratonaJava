package DevDojoExercicios.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Ha Ha o Kayo e foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("---------------");
        Optional<String> nameOptional = (findName("Kayo"));
        String empety = nameOptional.orElse("EMPETY");
        System.out.println(empety);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Kayo", "Kayk");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
