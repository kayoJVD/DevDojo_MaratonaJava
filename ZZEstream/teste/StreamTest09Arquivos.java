package DevDojoExercicios.ZZEstream.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest09Arquivos {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))){

            lines.filter(s -> s.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
