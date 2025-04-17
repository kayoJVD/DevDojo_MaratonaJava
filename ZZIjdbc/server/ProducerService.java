package DevDojoExercicios.ZZIjdbc.server;

import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.repository.Producerrepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        Producerrepository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers) {
        Producerrepository.saveTransaction(producers);
    }

    public static void delete(Integer id){
        requireValidId(id);
        Producerrepository.delete(id);
    }

    public static void update(Producer producer ){
        requireValidId(producer.getId());
        Producerrepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer ){
        requireValidId(producer.getId());
        Producerrepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll( ){
        return Producerrepository.findAll();
    }

    public static List<Producer> findByName( String name){
        return Producerrepository.findByName(name);
    }

    public static List<Producer> findByNamePreparedStatement( String name){
        return Producerrepository.findByNamePreparedStatement(name);
    }
    public static List<Producer> findByNameCallableStatement( String name){
        return Producerrepository.findByNameCallableStatement(name);
    }

    public static void showProducerMetaData( ){
         Producerrepository.showProducerMetaData();
    }

    public static void showDriverMetaData( ){
         Producerrepository.showDriverMetaData();

    }
    public static void showTypeScrollWorking( ){
         Producerrepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase( String name){
        return Producerrepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound( String name){
        return Producerrepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete( String name){
         Producerrepository.findByNameAndDelete(name);
    }

    private static void requireValidId(Integer id){
        if (id == null || id <=0 ){
            throw new IllegalArgumentException("invalid value for id");
        }
    }
}
