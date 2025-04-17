package DevDojoExercicios.ZZIjdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // java.sql = Connection, Statement, ResultSet, DriverMenager
    public static Connection getconnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String usename = "root";
        String password = "root";
        return DriverManager.getConnection(url, usename, password);
    }


    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String usename = "root";
        String password = "root";
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(usename);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/anime_store";
//        String usename = "root";
//        String password = "root";
//        cachedRowSet.setUrl(url);
//        cachedRowSet.setUsername(usename);
//        cachedRowSet.setPassword(password);
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
