/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import tiendaderopa.Vistas.NavBarSLC;

/**
 *
 * @author valen
 */
public class BarSLCont implements ActionListener{
    
    private NavBarSLC vista;
//    private JButton ingresar;
//    private JButton registrar;
    
    public BarSLCont(NavBarSLC view) {
        
        this.vista = view;

        // Obteniendo botones desde la vista
         
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
    
}
