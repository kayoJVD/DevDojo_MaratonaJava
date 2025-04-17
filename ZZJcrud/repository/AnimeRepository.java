package DevDojoExercicios.ZZJcrud.repository;


import DevDojoExercicios.ZZJcrud.conn.ConnectionFactory;
import DevDojoExercicios.ZZJcrud.dominio.Anime;
import DevDojoExercicios.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2

public class AnimeRepository {

    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententFindByname(coon, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("names"))
                        .episodes(rs.getInt("episodes"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.error("Erro while trying to find all Anime ", e);
        }
        return animes;
    }

    private static PreparedStatement createPrepareStatemententFindByname(Connection coon, String name) throws SQLException {
        String sql = ("SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'FROM anime_store.anime a inner join \n" +
                "anime_store.producer p on a.producer_id = p.id\n" +
                "where a.name like '%%';");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findByID(Integer id) {
        log.info("Finding Anime by id '{}", id);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententFindById(coon, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("names"))
                        .episodes(rs.getInt("episodes"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                return Optional.of(anime);
            }

        } catch (SQLException e) {
            log.error("Erro while trying to find all Anime ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatemententFindById(Connection coon, Integer id) throws SQLException {
        String sql = ("SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'FROM anime_store.anime a inner join \n" +
                "anime_store.producer p on a.producer_id = p.id\n" +
                "where a.id = ?;");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPrepareStatemententDelete(coon, id)) {
            ps.execute();
            log.info("Delete Anime '{}' from the database'{}'", id);

//            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro while trying to delete Anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatemententDelete(Connection coon, Integer id) throws SQLException {
        String sql = String.format("DELETE FROM `anime_store`.`Anime` WHERE (`id` = ?);");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime Anime) {
        log.info("Saving Anime by name '{}", Anime);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPreparedStatementSave(coon, Anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying to save Anime '{}'", Anime.getName(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection coon, Anime Anime) throws SQLException {
        String sql = String.format("INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);\n");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, Anime.getName());
        return ps;
    }

    public static void update(Anime Anime) {
        log.info("Updating Anime '{}", Anime);
        try (Connection coon = ConnectionFactory.getconnection();
             PreparedStatement ps = createPreparedStatementUpdate(coon, Anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying to update Anime '{}'", Anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection coon, Anime anime) throws SQLException {
        String sql = String.format("UPDATE `anime_store`.`anime` SET `name` = ? , `episodes` = ? WHERE (`id` = ?);");
        PreparedStatement ps = coon.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
