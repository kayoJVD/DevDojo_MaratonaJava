package DevDojoExercicios.Wnio.Exercicio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFile {
    public static void main(String[] args) {
        Path path = Paths.get("exemple.txt");
        Path dir = Paths.get("exempleDir");

        System.out.println("Arquivo Existente: " + Files.exists(path));
        System.out.println("Diretorio existente: " + Files.exists(dir));
    }
}
