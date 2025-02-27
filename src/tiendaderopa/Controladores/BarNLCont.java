package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import tiendaderopa.TiendaDeRopa;
import tiendaderopa.Vistas.HomeC;
import tiendaderopa.Vistas.Login;
import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.RegistroUsuario;

public class BarNLCont implements ActionListener {

    private NavBarNL vista;
    private JButton ingresar, registrar , zafHome;

    public BarNLCont(NavBarNL view) {
        this.vista = view;

        // Obteniendo botones desde la vista
        this.ingresar = vista.getBtnIngresar();
        this.registrar = vista.getBtnRegistrar();
        this.zafHome = vista.getZafiroHome();

        this.ingresar.addActionListener(this);
        this.registrar.addActionListener(this);
        this.zafHome.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
            abrirLogin();
        } else if (e.getSource() == registrar) {
            abrirRegistro();
        }else if (e.getSource() == zafHome){
            abrirHome();
        }
    }

    private void abrirLogin() {
        Login lg = new Login();
        new LoginCont(lg);
        TiendaDeRopa.cambiarPanel(lg); // Reemplaza la vista actual con el login
    }

    private void abrirRegistro() {
        RegistroUsuario regUser = new RegistroUsuario();
        new RegistroCont(regUser);
        TiendaDeRopa.cambiarPanel(regUser); // Reemplaza la vista actual con el registro
    }
    
    private void abrirHome(){
        HomeC homeC = new HomeC();
        TiendaDeRopa.cambiarPanel(homeC); // Reemplaza la vista actual con el home
    }
}
