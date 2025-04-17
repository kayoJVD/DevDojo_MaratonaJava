package DevDojoExercicios.ZZIjdbc.server;

import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbRowSet(name);
    }

    public static void updateJdbRowSet(Producer producer){
        ProducerRepositoryRowSet.UpdateJdbRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer){
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
