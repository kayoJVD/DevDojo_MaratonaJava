package DevDojoExercicios.ZZEstream.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        System.out.println(collect);
        Stream<String> stream = Arrays.stream(letters);
        System.out.println(stream);

        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(a -> Arrays.stream(a))
                .collect(Collectors.toList());//Stream<String>
        System.out.println(letters2);
    }
}
