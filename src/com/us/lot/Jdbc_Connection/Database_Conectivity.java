package com.us.lot.Jdbc_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_Conectivity {
    private static final String dburl = "jdbc:mysql://localhost:3306/Bank";
    private static final String username = "root";
    private static final String password = "password";

    public Connection getConnection() {
        Connection connection = null;
        try {
//       Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connecting to databases...");
            connection = DriverManager.getConnection(dburl, username, password);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return connection;
    }
}
