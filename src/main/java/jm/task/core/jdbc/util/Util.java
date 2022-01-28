package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String HOST_NAME = "localhost";
    private static final String DB_NAME = "mydatabase";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    public static final String CONNECTION_URL = "jdbc:mysql://" + HOST_NAME + ":3306/" + DB_NAME +
            "?useSSL=false&serverTimeZone=UTC";

    public static Connection getConnection() throws SQLException,
            ClassNotFoundException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
