/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;


import tiendaderopa.Modelos.Producto;

import tiendaderopa.Vistas.ProductoBolsa;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import tiendaderopa.Vistas.Bolsa;

/**
 *
 * @author valen
 */
public class BolsaCont {
    
    private JPanel contenedor;
    private Bolsa bolsa = new Bolsa();
    private List<ProductoBolsa> productosEnBolsa;
    private JButton borrar_prod;
    
    public BolsaCont() {
        this.contenedor = bolsa.getContProdsSelect();
        this.productosEnBolsa = new ArrayList<>();
        this.contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
    }


    public void agregarProducto(ProductoBolsa recuadroP) {
        productosEnBolsa.add(recuadroP);
        contenedor.add(recuadroP);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void cargarProductosBolsa() {
        contenedor.removeAll(); // Limpiar la vista antes de actualizar
    
        for (ProductoBolsa pb : productosEnBolsa) {
            contenedor.add(pb);
        }

        contenedor.revalidate();
        contenedor.repaint();
    }
    
    public void eliminarProducto(ProductoBolsa recuadroP) {
        productosEnBolsa.remove(recuadroP);
        contenedor.remove(recuadroP);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void vaciarBolsa() {
        productosEnBolsa.clear();
        contenedor.removeAll();
        contenedor.revalidate();
        contenedor.repaint();
    }

    
      
    
}
