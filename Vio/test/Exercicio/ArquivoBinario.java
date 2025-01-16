package DevDojoExercicios.Vio.test.Exercicio;

import java.io.*;

public class ArquivoBinario {
    public static void main(String[] args) {
        File arquivo = new File("dados.bin");

        // Escrever dados binários
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo))){
            dos.writeInt(123);
            dos.writeUTF("Exemplo de string em arquivo binário");
            System.out.println("Dados escritos no arquivo binário com sucesso");;
        }catch (IOException e){
            System.out.println("Erro ao escrever no arquivo binário: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(arquivo))){
            int numero = dis.readInt();
            String texto = dis.readUTF();
            System.out.println("Numero lido: " + numero);
            System.out.println("Texto lido: " + texto);
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo binário: " + e.getMessage());
        }
    }
}
