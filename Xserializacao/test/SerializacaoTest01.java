package DevDojoExercicios.Xserializacao.test;

import DevDojoExercicios.Xserializacao.dominio.Aluno;
import DevDojoExercicios.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Aluno aluno = new Aluno(1L, " Alves, ", "846138");
        Turma turma = new Turma("Virado no Jiraya");
        aluno.setTurma(turma);
       // serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno)  {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar() throws ClassNotFoundException {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
