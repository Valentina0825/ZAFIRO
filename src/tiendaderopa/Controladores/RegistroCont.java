package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tiendaderopa.Modelos.Usuario;
import tiendaderopa.Modelos.UsuarioDao;
import tiendaderopa.TiendaDeRopa;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.RegistroUsuario;

/**
 *
 * @author Valentina
 */
public class RegistroCont implements ActionListener {
    
    private RegistroUsuario vista;
    private UsuarioDao usuarioDao;
    
    private JButton registrar;
    private JPasswordField confContrasena;
    private JPasswordField contrasena;
    private JTextField correo;
    private JTextField nom_comp;
    private JTextField nom_user;
    
    public RegistroCont(RegistroUsuario view) {
        this.vista = view;
        this.usuarioDao = new UsuarioDao(); 
        
        // Obtener botones desde la vista
        this.registrar = vista.getBtn_registrar(); 
        this.registrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrar) {
            
            // Obtener datos de la vista
            this.confContrasena = vista.getConfContrasena();
            this.contrasena = vista.getContrasena();
            this.correo = vista.getCorreo();
            this.nom_comp = vista.getNom_comp();
            this.nom_user = vista.getNom_user();
            
            String passConf = String.valueOf(confContrasena.getPassword());
            String pass = String.valueOf(contrasena.getPassword());
            String email = correo.getText().trim();
            String nomComp = nom_comp.getText().trim();
            String nomUser = nom_user.getText().trim();
            
            // Validaciones
            if (nomUser.isEmpty() || nomComp.isEmpty() || email.isEmpty() || pass.isEmpty() || passConf.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!pass.equals(passConf)) {
                JOptionPane.showMessageDialog(vista, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!email.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(vista, "Correo electrónico inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (usuarioDao.usuarioExiste(nomUser)) {
                JOptionPane.showMessageDialog(vista, "El nombre de usuario ya está en uso.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Crear usuario y registrarlo
            Usuario usuario = new Usuario(nomComp, email, pass, 1, nomUser);
            boolean validacionReg = usuarioDao.setAgregar(usuario);
            
            if (validacionReg) {
                JOptionPane.showMessageDialog(vista, "Usuario registrado con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                // Cambiar a la vista de login
                TiendaDeRopa.cambiarPanel(new Login());
            } else {
                JOptionPane.showMessageDialog(vista, "Error al registrar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
