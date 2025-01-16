package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("exemple.txt");

        try{
            List<String> linhas = Files.readAllLines(path);
            for (String linha: linhas){
                System.out.println(linha);
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}
