package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import tiendaderopa.Modelos.UsuarioDao;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.TiendaDeRopa;

/**
 *
 * @author Valentina
 */
public class LoginCont implements ActionListener {

    private Login vista;
    private JButton ingresar; 
    private UsuarioDao usuarioDao;
    private JTextField userName;
    private JPasswordField contrasena;

    public LoginCont(Login view) {
        this.vista = view;
        this.usuarioDao = new UsuarioDao();

        // Obteniendo botones desde la vista
        this.ingresar = vista.getBtnIngresar();
        this.ingresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
            this.userName = vista.getNomUser();
            this.contrasena = vista.getPass();

            String user = userName.getText();
            String pass = String.valueOf(contrasena.getPassword());

            boolean validacionIng = usuarioDao.autenticarUsuario(user, pass);

            if (validacionIng) {
                // Cambiar la vista a HomeC y actualizar la barra de navegación
                TiendaDeRopa.getInstancia().actualizarEstadoUsuario(true); // Indicar que está logueado
                TiendaDeRopa.cambiarPanel(new HomeC());

            } else {
                JOptionPane.showMessageDialog(null, 
                    "El usuario '" + user + "' NO está registrado.", 
                    "Usuario NO registrado", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
