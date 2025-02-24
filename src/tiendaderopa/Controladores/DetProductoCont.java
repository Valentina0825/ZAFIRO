/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import javax.swing.JFrame;
import tiendaderopa.Modelos.Producto;
import tiendaderopa.TiendaDeRopa;
import tiendaderopa.Vistas.DetalleProducto;
import tiendaderopa.Vistas.HomeC;

/**
 *
 * @author valen
 */
public class DetProductoCont {
    
    
    public static void mostrarDetalle(Producto producto) {
        DetalleProducto vistaDetalle = new DetalleProducto(producto);
        
        TiendaDeRopa.cambiarPanel(vistaDetalle);
    }
    
}
