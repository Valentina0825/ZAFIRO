/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa.controladores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.VentanaLogin;
import javax.swing.*;

public class ControladorInicio implements ActionListener {
    public NavBarNL vista;
    public JPanel boton;
    
    public ControladorInicio(NavBarNL v) {
        this.vista = v;
        this.vista.btn_ingresar.addActionListener(this); // Agregar evento al botón
        this.vista.getIngresar() = boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.botonLogin) {
            abrirLogin();
        }
    }

    private void abrirLogin() {
        VentanaLogin loginFrame = new VentanaLogin(); // Crear la ventana de login
        loginFrame.setVisible(true); // Mostrar la ventana de login
        vista.dispose(); // Cerrar la ventana de inicio
    }
}