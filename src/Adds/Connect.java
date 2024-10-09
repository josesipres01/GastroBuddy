/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adds;

/**
 *
 * @author JCPer
 */

import java.sql.*;

public class Connect {
    public static java.sql.Connection connection;
    private static String URL = "jdbc:postgresql://127.0.0.1:5432/GastroServer";
    private static String user, password;

    public static String getUser() {
        return user;
    }
    public static String getPassword() {
        return password;
    }
    public static void setUser(String user) {
        Connect.user = user;
    }
    public static void setPassword(String password) {
        Connect.password = password;
    }

    public static void ConnectDB() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, user, password);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
