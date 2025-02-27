/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import tiendaderopa.Modelos.Usuario;
import tiendaderopa.TiendaDeRopa;
import tiendaderopa.Vistas.Bolsa;
import tiendaderopa.Vistas.NavBarSLC;


/**
 *
 * @author valen
 */
public class BarSLCont implements ActionListener{
    
    private NavBarSLC vista;
    private JButton bolsa;
    private Usuario user;
    private JLabel userLog;
//    private JButton registrar;
    
    public BarSLCont(NavBarSLC view, Usuario user) {
        
        this.vista = view;
        this.user = user;

        // Obteniendo botones desde la vista
        this.bolsa = vista.getBolsa();
        this.bolsa.addActionListener(this);
        
        this.userLog = vista.getNom_usuario();
        
        this.userLog.setText(user.getUsername_usu());
        
        // Validar que user no sea null antes de usarlo
        if (this.user != null) {
            this.userLog.setText(user.getUsername_usu());
        } else {
            this.userLog.setText("Usuario desconocido");
        }
        
        System.out.println(this.userLog.getText());
         
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == bolsa) {
            abrirBolsa();
        }
    }
    
    
    private void abrirBolsa() {
        Bolsa bolsa = new Bolsa();
//        new LoginCont(lg);
        TiendaDeRopa.cambiarPanel(bolsa); // Reemplaza la vista actual con la bolsa
    }
    
}
