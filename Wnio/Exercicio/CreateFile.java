package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        Path path = Paths.get("exemple.txt");
        String content = "Hello, java developer";

        try {
            Files.write(path, content.getBytes());
        }catch (IOException e){
            e.getMessage();
        }
    }
}
