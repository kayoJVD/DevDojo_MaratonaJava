package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemporaryFile {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("temp", ".txt");
            System.out.println("Arquivo temporário criado: " + tempFile);

            Files.write(tempFile, "Conteúdo temporário".getBytes());
            System.out.println("Conteúdo escrito no arquivo temporário.");

            String content = new String(Files.readAllBytes(tempFile));
            System.out.println("Conteúdo lido do arquivo temporário: " + content);

            Files.delete(tempFile);
            System.out.println("Arquivo temporário excluido.");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
