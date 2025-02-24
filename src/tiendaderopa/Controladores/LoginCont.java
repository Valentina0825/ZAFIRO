/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tiendaderopa.Modelos.UsuarioDao;
import tiendaderopa.Vistas.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class LoginCont implements ActionListener{

    private Login vista;
    private JButton ingresar; 
    private UsuarioDao usuarioDao;
    private JTextField userName;
    private String user;
    private JPasswordField contrasena;
    private String pass;
    private Boolean validacionIng;
    
    public LoginCont(Login view) {
        
        this.vista = view;
        this.usuarioDao = new UsuarioDao(); //se me olvido agregarlo
        
        this.userName = vista.getNomUser() ;
        this.user = userName.getText();
        
        this.contrasena = vista.getPass() ;
        this.pass = String.valueOf(contrasena.getPassword());
        
        // Obteniendo botones desde la vista
        this.ingresar = vista.getBtnIngresar(); 
        this.ingresar.addActionListener(this);    
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
            
            this.validacionIng = usuarioDao.autenticarUsuario(user, pass);
            if(validacionIng == true){
                JOptionPane.showMessageDialog(null, "El usuario se encuentra registrado :D", "Usuario registrado" , JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El usuario /n" + user + "/n" + pass + "/n" +"NO esta registrado ;_;", "Usuario NO registrado" , JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
    
    }
}
