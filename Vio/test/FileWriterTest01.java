package DevDojoExercicios.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWrites
// FileReader
// BufferedWriter
// BuffereReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("teste.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O Kayo vai ser um dos melhores desenvolvedores Back-end do Brasil\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
