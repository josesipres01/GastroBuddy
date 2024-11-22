/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pantallas.Login;

/**
 *
 * @author luisi
 */
public class Main {
    public static void main(String[] args) {  
    
        
        // Crear un JFrame
        JFrame frame = new JFrame("Login Screen");
        
        // Crear una instancia del panel Login
        Login loginPanel = new Login();
        
        // Configurar el JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar ventana
        frame.setSize(1100, 750); // Tamaño del JFrame
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        frame.setResizable(false); // Desactiva el redimensionamiento (y elimina el botón de maximizar)



        
        // Agregar el panel Login al JFrame
        frame.setContentPane(loginPanel);
        
        // Hacer visible el JFrame
        frame.setVisible(true);
        

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "[ERROR]: No fue posible establecer el L&F" );
        }

        

    }
 }  

