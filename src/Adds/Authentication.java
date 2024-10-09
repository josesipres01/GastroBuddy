/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adds;

/**
 *
 * @author JCPer
 */
public class Authentication {
    public static boolean authUser(String user, String password) {
        boolean connection = false;
        Connect.setUser(user);
        Connect.setPassword(password);
        try {
            Connect.ConnectDB();
            connection = true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }
}
