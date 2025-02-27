/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import javax.swing.JFrame;
import tiendaderopa.Modelos.Producto;
import tiendaderopa.TiendaDeRopa;
import tiendaderopa.Vistas.PanelDetalleProducto;
import tiendaderopa.Vistas.HomeC;

/**
 *
 * @author valen
 */
public class PestProductoCont {
    
    
    public static void mostrarDetalle(Producto producto) {
        PanelDetalleProducto vistaDetalle = new PanelDetalleProducto(producto);
        DetProductoCont controldet = new DetProductoCont(vistaDetalle);
        TiendaDeRopa.cambiarPanel(vistaDetalle);
    }
    
}
