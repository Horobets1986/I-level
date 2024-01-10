package ua.horobets.hw19;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection get() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/alevel", "postgres", "tm113_gva");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}