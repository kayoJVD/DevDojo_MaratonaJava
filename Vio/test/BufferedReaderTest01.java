package DevDojoExercicios.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("teste.txt");
        try (FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr)){
            String linha;
            while ((linha = bw.readLine()) != null){
                System.out.println(linha);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
