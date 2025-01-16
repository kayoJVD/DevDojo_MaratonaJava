package DevDojoExercicios.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isdiretorioCreated = fileDirectory.mkdir();
        System.out.println(isdiretorioCreated);

        File fileArquivoDiretorio = new File(fileDirectory,"arquivo.txt");
        boolean isNewFile = fileArquivoDiretorio.createNewFile();
        System.out.println(isNewFile);

        File fileRenamed = new File(fileDirectory,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDirectoryNew = fileDirectory.renameTo(diretorioRenamed);
        System.out.println(isDirectoryNew);
    }
}
