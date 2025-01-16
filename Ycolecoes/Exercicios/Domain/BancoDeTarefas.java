package DevDojoExercicios.Ycolecoes.Exercicios.Domain;

import java.util.ArrayList;
import java.util.List;

public class BancoDeTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public BancoDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void lisTasks(List<Tarefa> tarefass){
        for (Tarefa tarefa1: tarefas){
            System.out.println("Nome da tarefa: " + tarefa1.getNome() + "ID: " +tarefa1.getId());
        }
    }

    public void tasksRemove(Tarefa tarefa){
        tarefas.remove(tarefa);
        System.out.println("Tarefa removida");
    }
}
