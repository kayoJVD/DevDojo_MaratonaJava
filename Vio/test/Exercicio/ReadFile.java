package DevDojoExercicios.Vio.test.Exercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("arquivoChatGpt.txt");
        try (BufferedReader bw = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = bw.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            System.out.println("Erro na leitura do arquivo" + e.getMessage());
        }
    }
}
