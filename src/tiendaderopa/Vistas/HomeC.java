/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.NavBarSLC;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import tiendaderopa.Controladores.BarNLCont;
import tiendaderopa.Controladores.ContenidoCont;

/**
 *
 * @author valen
 */
public class HomeC extends javax.swing.JPanel {
    
    /**
     * Creates new form home
     */
    boolean login = false;
    NavBarNL barraNavegacionNL = new NavBarNL();
    NavBarSLC barraNavegacionSL = new NavBarSLC();
    
    public HomeC() {
        initComponents(); 
        generarContenido();
        generarPagina(); 
        
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        contenido.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 550));
    }// </editor-fold>//GEN-END:initComponents

    
    private void generarContenido(){
        new ContenidoCont(contenido);
    }
    
    private void generarPagina(){
        
        this.setLayout(new BorderLayout());
        if (login) {
            this.add(barraNavegacionSL, BorderLayout.NORTH);
            
        } else {
            this.add(barraNavegacionNL, BorderLayout.NORTH);
            BarNLCont controlador = new BarNLCont(barraNavegacionNL);
        }
       
        // Remueve jScrollPane1 de donde fue agregado antes
        this.remove(jScrollPane1);

        // Agrega jScrollPane1 en BorderLayout.SOUTH
        this.add(jScrollPane1, BorderLayout.SOUTH);

        // Refresca el diseño para aplicar los cambios
        this.revalidate();
        this.repaint();
   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    

}
