package DevDojoExercicios.Vio.test.Exercicio;

import java.io.File;
import java.io.IOException;

public class ManipularDiretorio {
    public static void main(String[] args) {
        File diretorio = new File("meuDiretorio");

        if (!diretorio.exists()){
            boolean isMkdir = diretorio.mkdir();
            System.out.println("Direotio criado com sucesso");
        }
        for (int i = 0; i < 3; i++) {
            File arquivo = new File(diretorio, "arquivo" + i + ".txt");
            try {
                if (arquivo.createNewFile()){
                    System.out.println("Arquivo " + arquivo.getName() + " criado com sucesso");
                }
            } catch (IOException e) {
                System.out.println("Erro ao criar arquivo: " + e.getMessage());
            }

            File[] arquivos = diretorio.listFiles();
            System.out.println("\nArquivos no diretório " + diretorio.getName() + ":");
            if (arquivos != null){
                for (File f: arquivos){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
