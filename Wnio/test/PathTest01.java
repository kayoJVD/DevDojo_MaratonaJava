package DevDojoExercicios.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("teste.txt");
        System.out.println(p1.getFileName());
    }
}
