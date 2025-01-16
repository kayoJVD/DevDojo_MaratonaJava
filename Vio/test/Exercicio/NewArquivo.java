package DevDojoExercicios.Vio.test.Exercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewArquivo {
    public static void main(String[] args) {
        File file = new File("arquivoChatGpt.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("Hello chatgpt");
            bw.flush();
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }

    }
}
