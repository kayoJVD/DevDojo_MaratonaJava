package DevDojoExercicios.ZZIjdbc.test;

import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.repository.ProducerRepositoryRowSet;
import DevDojoExercicios.ZZIjdbc.server.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(16).name("MADHOUSE").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("-------------------------");
//
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbRowSet("NHK");
//        log.info(producers);
    }
}
