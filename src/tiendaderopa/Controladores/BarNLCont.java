/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.NavBarNL;

/**
 *
 * @author valen
 */
public class BarNLCont implements ActionListener{
    
    private NavBarNL vista;
    private JButton ingresar;
    private JButton registrar;

    public BarNLCont(NavBarNL view) {
        
        this.vista = view;

        // Obteniendo botones desde la vista
        this.ingresar = vista.getBtnIngresar(); 
        this.registrar = vista.getBtnRegistrar();

        this.ingresar.addActionListener(this);
        this.registrar.addActionListener(this); 
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
<<<<<<< HEAD:src/tiendaderopa/Controladores/InicioCont.java
            JFrame loginFrame = new JFrame("Iniciar Sesión");
                    loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    loginFrame.setSize(1300, 650);
                    loginFrame.setLocationRelativeTo(null);
                    
                    Login lg = new Login(); // Crear la instancia de Login (si es un JPanel)
=======
//            JOptionPane.showMessageDialog(null, "¡Botón Ingresar presionado!");
                    JFrame loginFrame = new JFrame("Iniciar Sesión");
                    loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    loginFrame.setSize(1300, 650); loginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    loginFrame.setLocationRelativeTo(null);
                    
                    Login lg = new Login(); // Crear el objeto de Login para meter el panel en el jframe
>>>>>>> a340856a572f7387b28a568140888e289dc9d0b5:src/tiendaderopa/Controladores/BarNLCont.java
                    loginFrame.add(lg); // Agregar el JPanel a la ventana
                    loginFrame.setVisible(true);

                    // Buscar la ventana padre y cerrarla si es JFrame
                    JFrame ventanaPadre = (JFrame) vista.getTopLevelAncestor();
<<<<<<< HEAD:src/tiendaderopa/Controladores/InicioCont.java
=======
                    
>>>>>>> a340856a572f7387b28a568140888e289dc9d0b5:src/tiendaderopa/Controladores/BarNLCont.java
                    if (ventanaPadre != null) {
                        ventanaPadre.dispose();
                    }
        }if (e.getSource() == registrar) {
            JOptionPane.showMessageDialog(null, "¡Botón R presionado!");
        }
    } 

    
}


