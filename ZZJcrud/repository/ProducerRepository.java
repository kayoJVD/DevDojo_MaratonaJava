package DevDojoExercicios.ZZJcrud.repository;


import DevDojoExercicios.ZZJcrud.conn.ConnectionFactory;
import DevDojoExercicios.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2

public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("Finding Producer by name '{}", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententFindByname(coon, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                var names = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(names).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatemententFindByname(Connection coon, String name) throws SQLException {
        String sql = ("SELECT * FROM anime_store.producer where name like ?;");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> findByID(Integer id) {
        log.info("Finding Producer by id '{}", id);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententFindById(coon, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            while (rs.next()) {
                return Optional.of(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("names"))
                        .build());
            }

        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatemententFindById(Connection coon, Integer id) throws SQLException {
        String sql = ("SELECT * FROM anime_store.producer where id = ?;;");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententDelete(coon, id)) {
            ps.execute();
            log.info("Delete producer '{}' from the database'{}'", id);

//            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatemententDelete(Connection coon, Integer id) throws SQLException {
        String sql = String.format("DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producer by name '{}", producer);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPreparedStatementSave(coon, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying to save producer '{}'", producer.getName(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection coon, Producer producer) throws SQLException {
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}", producer);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPreparedStatementUpdate(coon, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection coon, Producer producer) throws SQLException {
        String sql = String.format("UPDATE `anime_store`.`producer` SET `name` = ?WHERE (`id` = ?)");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
