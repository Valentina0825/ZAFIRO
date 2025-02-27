package tiendaderopa;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import tiendaderopa.Controladores.BarNLCont;
import tiendaderopa.Controladores.BarSLCont;
import tiendaderopa.Controladores.HomeVCont;
import tiendaderopa.Modelos.Conexion;
import tiendaderopa.Modelos.Usuario;
import tiendaderopa.Vistas.Bolsa;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.Vistas.HomeV;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.NavBarSLC;
import tiendaderopa.Vistas.RegistroUsuario;


/**
 *
 * @author Valen
 */
public class TiendaDeRopa extends JFrame {

    private static TiendaDeRopa instancia; 
    private boolean usuarioLogueado = false; // Estado del usuario
    private NavBarNL barraNavegacionNL = new NavBarNL();
    private NavBarSLC barraNavegacionSL = new NavBarSLC();
    public Usuario usuario = new Usuario();
    private JPanel navBar;
    private int idRol;

        public TiendaDeRopa() {
            instancia = this;
            this.setTitle("ZAFIRO");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(1300, 650);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLayout(new BorderLayout());

            
            // Selección de la barra de navegación según el estado del usuario
            if (!usuarioLogueado) {
                new BarNLCont(barraNavegacionNL);
                navBar = barraNavegacionNL;
            } else {
                new BarSLCont(barraNavegacionSL, usuario);
                navBar = barraNavegacionSL;
            }

            // Agregar la barra de navegación
            this.add(navBar, BorderLayout.NORTH);

            // Mostrar la página de inicio
            cambiarPanel(new HomeC());

            this.setVisible(true);
        }

        /**
         * Permite obtener la instancia única de la aplicación.
         */
        public static TiendaDeRopa getInstancia() {
            return instancia;
        }

        /**
         * Cambia el panel central de la ventana principal.
         */
        public static void cambiarPanel(JPanel nuevoPanel) {
            instancia.getContentPane().removeAll(); // Eliminar el panel actual
            if (!(nuevoPanel instanceof Login) && !(nuevoPanel instanceof RegistroUsuario)) {
                // Solo agregar la barra de navegación si no es un panel de login o registro
                instancia.getContentPane().add(instancia.navBar, BorderLayout.NORTH);// Agregar la barra de navegación
            }  
            instancia.getContentPane().add(nuevoPanel, BorderLayout.CENTER); // Agregar el nuevo panel
            instancia.getContentPane().revalidate();
            instancia.getContentPane().repaint();
        }

        /**
         * Actualiza la barra de navegación según el estado de sesión.
         */
            // Agregar la nueva barra de navegación

        public void actualizarEstadoUsuario(boolean logueado, Usuario user) {
            this.usuarioLogueado = logueado;
            this.usuario = user; // Asigna correctamente el usuario
            this.idRol = user.getRolID_usu(); 

            // Debug para ver el rol del usuario en consola
            System.out.println("Usuario logueado: " + user.getUsername_usu() + " - Rol: " + idRol);

            // Eliminar la barra de navegación actual
            this.getContentPane().remove(navBar);

            if (usuarioLogueado) {
                navBar = barraNavegacionSL;
                new BarSLCont(barraNavegacionSL, user); 
            } else {
                navBar = barraNavegacionNL;
                new BarNLCont(barraNavegacionNL);
                cambiarPanel(new HomeC());
            }

            // Agregar la nueva barra de navegación
            this.add(navBar, BorderLayout.NORTH);
            this.revalidate();
            this.repaint();
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new TiendaDeRopa(); // Inicia la aplicación
            });

            Conexion conex = new Conexion();
            if (conex.getConexion() != null) { 
                System.out.println("Conexión exitosa :D");
            } else {
                System.out.println("No se pudo conectar a la base de datos :(.");
            }
        } 
}



