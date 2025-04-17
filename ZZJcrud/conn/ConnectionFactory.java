package DevDojoExercicios.ZZJcrud.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getconnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String usename = "root";
        String password = "root";
        return DriverManager.getConnection(url, usename, password);
    }
}
