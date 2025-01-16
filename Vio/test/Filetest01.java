package DevDojoExercicios.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Filetest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\file.txt");
        try {
            boolean isNewFile = file.createNewFile();
            System.out.println("Created: "+ isNewFile);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolute: " + file.getAbsolutePath());
            System.out.println("Directory: " + file.isDirectory());
            System.out.println("file: " + file.isFile());
            System.out.println("Hildden: " + file.isHidden());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            boolean isExists = file.exists();
            System.out.println("Exist:" + isExists);
            if (isExists){
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
