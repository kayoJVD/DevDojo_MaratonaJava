package DevDojoExercicios.ZZIjdbc.repository;

import DevDojoExercicios.ZZIjdbc.conn.ConnectionFactory;
import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import DevDojoExercicios.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbRowSet(String name){
        String sql = ("SELECT * FROM anime_store.producer where name like ?;");
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return producers;
    }

//    public static void UpdateJdbRowSet(Producer producer){
//        String sql = String.format("UPDATE `anime_store`.`producer` SET `name` = ?WHERE (`id` = ?)");
//        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }


    public static void UpdateJdbRowSet(Producer producer){
        String sql = String.format("SELECT * FROM anime_store.producer WHERE (`id` = ?)");
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateCachedRowSet(Producer producer){
        String sql = String.format("SELECT * FROM producer WHERE (`id` = ?)");
        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
             Connection connection = ConnectionFactory.getconnection()){
            connection.setAutoCommit(false);
//            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            crs.acceptChanges();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
