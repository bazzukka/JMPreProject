package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    public static final String userName = "root";
    public static final String password = "root";
    public static final String connectionURL = "jdbc:mysql://localhost:3306/Mysql";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println("driver hasn't been found or connection failed");
            e.printStackTrace();
        }
        return connection;
    }
}
