/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Controladores;

import tiendaderopa.Modelos.Conexion;
import tiendaderopa.Modelos.Producto;
import tiendaderopa.Modelos.ProductoDao;
import tiendaderopa.Vistas.PanelProducto;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author valen
 */
public class ContenidoCont {
        
    private JPanel panelContenido;
    private ProductoDao productoDao;
    private JButton detalle_prd;
    
    private ArrayList<Producto> listaProductos;
    
    public ContenidoCont(JPanel panelContenido) {
        
        this.panelContenido = panelContenido;
        this.productoDao = new ProductoDao();
        cargarProductos();        
       
    }
    
    private void cargarProductos() {
        List<Producto> listaProductos = productoDao.listar();
        panelContenido.setLayout(new GridLayout(0, 4, 20, 20)); // 4 columnas, espacio de 20px

        for (Producto producto : listaProductos) {
            PanelProducto panel = new PanelProducto(producto);
            this.detalle_prd = panel.getBtn_detalle();
            detalle_prd.addActionListener(e -> PestProductoCont.mostrarDetalle(producto));

            panelContenido.add(panel);
            
        }

        panelContenido.revalidate();
        panelContenido.repaint();
        
    }
    
    
    
} 

