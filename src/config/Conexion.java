package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection con;
    private boolean estCon;

   public Conexion() {
    try {
        Class.forName("org.postgresql.Driver");
        String ip = "localhost";
        String puerto = "5432";
        String bd = "GastroServer";
        con = DriverManager.getConnection("jdbc:postgresql://" + ip + ":" + puerto + "/" + bd, "developer", "sono1306");

        if (con != null && !con.isClosed()) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("La conexión no se pudo establecer.");
        }
        estCon = true;
    } catch (Exception e) {
        estCon = false;
        System.out.println("Error al establecer conexión: " + e.getMessage());
        JOptionPane.showMessageDialog(null, e.getMessage() + "\nIntentelo de nuevo.", "Error de Base de datos", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}


    public Connection getConnection() {
        String ip = "localhost";
        String puerto = "5432";
        String bd = "GastroServer";
        Connection con = null;
        try {
            // Configura tu URL, usuario y contraseña
            con = DriverManager.getConnection("jdbc:postgresql://" + ip + ":" + puerto + "/" + bd, "developer", "sono1306");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean getEstado() {
        return estCon;
    }

    public void closeConnection() throws SQLException {
    System.out.println("Cerrando conexión...");
    if (con != null && !con.isClosed()) {
        con.close();
        System.out.println("Conexión cerrada correctamente.");
    } else {
        System.out.println("La conexión ya estaba cerrada.");
    }
}

}
