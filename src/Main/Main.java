/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author luisi
 */
public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "[ERROR]: No fue posible establecer el L&F" );
        }

        java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run(){
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
}
