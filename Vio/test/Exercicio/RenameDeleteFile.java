package DevDojoExercicios.Vio.test.Exercicio;

import java.io.File;
import java.io.IOException;

public class RenameDeleteFile {
    public static void main(String[] args) {
        File fileOriginal = new File("arquivoOriginal.txt");

        try {
            if (fileOriginal.createNewFile()) {
                System.out.println("Arquivo original criado.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }

        File fileRenamed = new File("arquivoRenomeado.txt");


        if (fileRenamed.renameTo(fileOriginal)) {
            System.out.println("O arquivo foi renomeado.");



        }else{
            System.out.println("Erro na renomeação do arquivo: ");
        }

        if (fileRenamed.delete()){
            System.out.println("Arquivo excluído com sucesso.");
        }else {
            System.out.println("Erro ao excluir arquivo.");
        }
    }
}
