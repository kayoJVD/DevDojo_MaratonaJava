package DevDojoExercicios.ZZIjdbc.repository;

import DevDojoExercicios.ZZIjdbc.conn.ConnectionFactory;
import DevDojoExercicios.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Producerrepository {
    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')", producer.getName());
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer rows '{}' affected in the database, rows affected{}", producer.getName(), rowsAffected);

//            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to indert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection coon = ConnectionFactory.getconnection()) {
            coon.setAutoCommit(false);
            preparedStatementSaveTransaction(coon, producers);
            coon.commit();
            coon.setAutoCommit(true);
        } catch (SQLException e) {
            log.error("Erro while trying to save producer '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection coon, List<Producer> producers) throws SQLException {
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ( ? )");
        boolean shouldRollback = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = coon.prepareStatement(sql)) {
                log.info("Saving producer '{}'", p.getName());
                ps.setString(1, p.getName());
                if (p.getName().equals("White Fox")) throw new SQLException("Can't save white fox");
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback) {
            log.warn("Transaction is going be rollback");
            coon.rollback();
        }

    }

    public static void delete(int id) {
        String sql = String.format("DELETE FROM `anime_store`.`producer` WHERE (`id`) = '%d'", id);
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' from the database, rows affected '{}'", id, rowsAffected);

//            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to delete producer '{}'", id, e);
        }
    }


    public static void update(Producer producer) {
        String sql = String.format("UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d')"
                , producer.getName(), producer.getId());
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = preparedStatement(coon, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatement(Connection coon, Producer producer) throws SQLException {
        String sql = String.format("UPDATE `anime_store`.`producer` SET `name` = ?WHERE (`id` = ?)");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer;";
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                var name = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name).build();
                producers.add(producer);
            }


        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding Producer by name");
        String sql = String.format("SELECT id, name FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
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


    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding Producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = PreparedStatmentFindByname(coon, name);
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

    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding Producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = callableStatmentFindByname(coon, name);
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

    private static CallableStatement callableStatmentFindByname(Connection coon, String name) throws SQLException {
        String sql = ("CALL `anime_store`.`sp_get_producer_by_name`(?);");
        CallableStatement cs = coon.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;
    }

    private static PreparedStatement PreparedStatmentFindByname(Connection coon, String name) throws SQLException {
        String sql = ("SELECT * FROM anime_store.producer where name like ?;");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer MetaData");
        String sql = ("SELECT * FROM anime_store.producer");
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Colums count '{}'", columnCount);
            for (int i = 1; i < columnCount; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));
            }


        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver MetaDta");
        try (Connection coon = ConnectionFactory.getconnection();) {
            DatabaseMetaData bdMetaData = coon.getMetaData();
            if (bdMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY)");
                if (bdMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE)");
                }
            }

            if (bdMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE)");
                if (bdMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE)");
                }
            }

            if (bdMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE)");
                if (bdMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE)");
                }
            }
        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = ("SELECT id, name FROM anime_store.producer order by name desc;");
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {


            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Firts row? '{}'", rs.first());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute '{}'", rs.absolute(2));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Relative '{}'", rs.relative(-1));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Is Last '{}'", rs.isLast());
            log.info("Row number '{}'", rs.getRow());

            log.info("Is First '{}'", rs.isFirst());
            log.info("Row number '{}'", rs.getRow());

            log.info("Last Row '{}'", rs.last());
            log.info("-----------------------------------");
            rs.next();
            log.info("After last Row '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding Producer by name.");
        String sql = String.format("SELECT id, name FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();
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

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding Producer by name.");
        String sql = String.format("SELECT id, name FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return producers;
            }
            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding Producer by name.");
        String sql = String.format("SELECT id, name FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             Statement stmt = coon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Erro while trying to find all producer ", e);
        }
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }

}
