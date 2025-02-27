/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import tiendaderopa.Modelos.Producto;
import tiendaderopa.Vistas.PanelDetalleProducto;
import tiendaderopa.Vistas.ProductoBolsa;

/**
 *
 * @author valen
 */
public class DetProductoCont implements ActionListener{
    
    private PanelDetalleProducto vista;
    private Producto producto;
    private JButton agregarBolsa;
    private JButton comprar;

    public DetProductoCont(PanelDetalleProducto vistaDetalle) {
        this.vista = vistaDetalle;
        this.agregarBolsa = vista.getBtn_agregarBolsa() ;
        this.agregarBolsa.addActionListener(this); 
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarBolsa) {
            this.producto = this.vista.getProduc();
            ProductoBolsa platillaProdBolsa = new ProductoBolsa(producto);
            BolsaCont contPlantPBolsa = new BolsaCont();
            contPlantPBolsa.agregarProducto(platillaProdBolsa);
        }
    }
    
    
    
}
