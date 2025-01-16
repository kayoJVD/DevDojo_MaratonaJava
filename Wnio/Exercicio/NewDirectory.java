package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewDirectory {
    public static void main(String[] args) {
        Path directory = Paths.get("novoDiretorio");
        Path subDirectory = Paths.get("novoDiretorio/subDiretorio");

        try {
            Files.createDirectories(directory);
            Files.createDirectories(subDirectory);
            System.out.println("Diretorios criado com sucesso.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
