/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaderopa;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import tiendaderopa.Modelos.Conexion;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.Vistas.RegUsuario;


/**
 *
 * @author valen
 */
public class TiendaDeRopa extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    boolean validacion = false;
    
    public TiendaDeRopa() {
        
        this.setTitle("ZAFIRO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300, 650); /*this.setExtendedState(JFrame.MAXIMIZED_BOTH); */
        //this.setLayout(new BorderLayout());
        
        HomeC pagina = new HomeC();
        
        
        this.add(pagina);
        
        this.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> new TiendaDeRopa());
//        Conexion conex = new Conexion();
//        conex.getConection();
        Conexion conex = new Conexion();
        if (conex.getConnection() != null) { // Si la conexión es exitosa
            System.out.println("Conexión exitosa :D");
            SwingUtilities.invokeLater(() -> new TiendaDeRopa()); // Inicia la ventana
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
}
