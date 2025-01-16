package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFile {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta");

        try (Stream<Path> pathStream = Files.walk(dir)){
            pathStream.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
