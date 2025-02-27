package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import tiendaderopa.Modelos.Usuario;
import tiendaderopa.Modelos.UsuarioDao;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.TiendaDeRopa;
import static tiendaderopa.TiendaDeRopa.cambiarPanel;
import tiendaderopa.Vistas.HomeV;

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
    public Usuario usuario = new Usuario();
    private int idRol;

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
                
                usuario = usuarioDao.cargarUsuario(user);
                
                if (usuario == null) {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo cargar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Verificar que se está obteniendo un usuario con datos correctos
                System.out.println("Usuario autenticado: " + usuario.getUsername_usu());
                
                // Cambiar la vista a HomeC y actualizar la barra de navegación
                TiendaDeRopa.getInstancia().actualizarEstadoUsuario(true, usuario); // Indicar que está logueado
                this.idRol = usuario.getRolID_usu();
                // Cambiar la vista según el rol
                switch (idRol) {
                    case 1:
                        System.out.println("Cargando vista para Cliente..." );
                        TiendaDeRopa.cambiarPanel(new HomeC()); // Si tienes una vista para clientes
                        break;
                    case 2:
                        System.out.println("Cargando vista para Vendedor...");
                        // Reemplaza la vista actual con el home de vendedor
                        HomeV hV = new HomeV();
                        new HomeVCont(hV);
                        TiendaDeRopa.cambiarPanel(hV);
                        
                        break;
                    case 3:
                        System.out.println("Cargando vista para Administrador...");
                        // cambiarPanel(new HomeAdmin()); // Si tienes una vista para admin
                        break;
                    case 4:
                        System.out.println("Cargando vista para Cliente...");
                        // cambiarPanel(new HomeCliente()); // Si tienes una vista para clientes
                        break;
                    default:
                        System.out.println("Rol no reconocido, mostrando vista por defecto...");
                        TiendaDeRopa.cambiarPanel(new HomeC());
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, 
                    "El usuario '" + user + "' NO está registrado.", 
                    "Usuario NO registrado", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
