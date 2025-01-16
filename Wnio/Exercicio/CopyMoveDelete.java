package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyMoveDelete {
    public static void main(String[] args) {
        Path origem = Paths.get("original.txt");
        Path copy = Paths.get("copia.txt");
        Path backup = Paths.get("backup");

        try{
            //copiar arquivo
            Files.createFile(origem);
            Files.copy(origem, copy, StandardCopyOption.REPLACE_EXISTING);
            // Mover arquivo para backup
            Path directories = Files.createDirectories(backup);
            Files.move(copy, backup.resolve(copy.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido para o diretótio backup!");

            //Excluir arquivo original
            Files.delete(origem);
            System.out.println("Arquivo original excluido!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
