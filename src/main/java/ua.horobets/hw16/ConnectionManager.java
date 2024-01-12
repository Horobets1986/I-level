package ua.horobets.hw16;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/alevel", "postgres", "tm113_gva");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}