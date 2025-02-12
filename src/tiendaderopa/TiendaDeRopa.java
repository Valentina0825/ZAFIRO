/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaderopa;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.Login_v2;
import tiendaderopa.Vistas.Home;
import tiendaderopa.Vistas.RegUsuarios;

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
        
        Login_v2 index = new Login_v2();
        
        this.add(index);
        
        this.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> new TiendaDeRopa());
    }
    
}
