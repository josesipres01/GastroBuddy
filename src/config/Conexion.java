
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    Connection con;
    boolean estCon;
    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            String ip = "localhost";
            String puerto = "5432";
            String bd = "GastroServerVFinal";
            con=DriverManager.getConnection("jdbc:postgresql://"+ ip +":"+ puerto + "/"+ bd ,"postgres", "12345");
            estCon = true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "La base de datos no esta activa.\nIntentelo de nuevo.\n" + e.getMessage(), "Error de Base de datos", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nIntentelo de nuevo." , "Error de Base de datos", JOptionPane.ERROR_MESSAGE);
            //System.err.println("Error:"+e);
            estCon = false;
            System.exit(0);
        }        
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public boolean getEstado(){
        return estCon;
    }
    
    public void closeConnection() throws SQLException{
        con.close();
    }
    
  }
