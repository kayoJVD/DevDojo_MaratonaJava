package DevDojoExercicios.ZZIjdbc.test;


import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.repository.Producerrepository;
import DevDojoExercicios.ZZIjdbc.server.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("One piece").build();
        Producer producerTpUpdate = Producer.builder().id(1).name("one piece").build();
//        ProducerService.save(producer);
//        Producerrepository.delete(4);
//        Producerrepository.update(producerTpUpdate);
//        List<Producer> producers = Producerrepository.findAll();
//        List<Producer> producersName = Producerrepository.findByName("One");
//        log.info("Producers found '{}'",producersName);

//        Producerrepository.showProducerMetaData();
//        Producerrepository.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("One");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
//        log.info("Producers found '{}'", producers);
//        log.info("Producers found '{}'", producers);
//        Producerrepository.updatePreparedStatement(producerTpUpdate);
//        Producerrepository.updatePreparedStatement(producerTpUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("SASA");
        log.info("Producers found '{}'", producers);

//        Producer producer = Producer.builder().name("One piece").build();
//        Producerrepository.save(producer);
//        log.info("info");
//        log.debug("debug");
//        log.warn("warn");
//        log.error("error");
//        log.trace("trace");
    }
}
