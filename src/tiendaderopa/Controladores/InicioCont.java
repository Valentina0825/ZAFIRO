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
public class InicioCont implements ActionListener{
    
    private NavBarNL vista;
    private JButton ingresar;
    private JButton registrar;

    public InicioCont(NavBarNL view) {
        
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
            JOptionPane.showMessageDialog(null, "¡Botón Ingresar presionado!");
        }if (e.getSource() == registrar) {
            JOptionPane.showMessageDialog(null, "¡Botón Registrarse presionado!");
        }
    } 

    
}


