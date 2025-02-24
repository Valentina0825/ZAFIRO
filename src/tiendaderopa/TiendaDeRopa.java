package tiendaderopa;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import tiendaderopa.Controladores.BarNLCont;
import tiendaderopa.Controladores.BarSLCont;
import tiendaderopa.Modelos.Conexion;
import tiendaderopa.Vistas.Bolsa;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.NavBarSLC;

/**
 *
 * @author Valen
 */
public class TiendaDeRopa extends JFrame {

    private static TiendaDeRopa instancia; 
    private boolean usuarioLogueado = false; // Estado del usuario
    private NavBarNL barraNavegacionNL = new NavBarNL();
    private NavBarSLC barraNavegacionSL = new NavBarSLC();
    private JPanel navBar;

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
            new BarSLCont(barraNavegacionSL);
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
        instancia.getContentPane().add(instancia.navBar, BorderLayout.NORTH); // Agregar la barra de navegación
        instancia.getContentPane().add(nuevoPanel, BorderLayout.CENTER); // Agregar el nuevo panel
        instancia.revalidate();
        instancia.repaint();
    }

    /**
     * Actualiza la barra de navegación según el estado de sesión.
     */
    public void actualizarEstadoUsuario(boolean logueado) {
        this.usuarioLogueado = logueado;
        
        // Eliminar la barra de navegación actual
        this.getContentPane().remove(navBar);

        // Cambiar la barra de navegación dependiendo del estado
        if (usuarioLogueado) {
            navBar = barraNavegacionSL;
            new BarSLCont(barraNavegacionSL);
        } else {
            navBar = barraNavegacionNL;
            new BarNLCont(barraNavegacionNL);
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
