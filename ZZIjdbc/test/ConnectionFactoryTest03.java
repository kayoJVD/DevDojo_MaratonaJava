package DevDojoExercicios.ZZIjdbc.test;

import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.server.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("OToei Animation").build();
        Producer producer2 = Producer.builder().name("White Fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
