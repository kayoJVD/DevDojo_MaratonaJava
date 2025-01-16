package DevDojoExercicios.Minterfaces.Test;

import DevDojoExercicios.Minterfaces.Dominio.DataLoader;
import DevDojoExercicios.Minterfaces.Dominio.DatabaseLoader;
import DevDojoExercicios.Minterfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkpermission();
        fileLoader.checkpermission();

        DataLoader.retrivieMaxDatSize();
    }
}
