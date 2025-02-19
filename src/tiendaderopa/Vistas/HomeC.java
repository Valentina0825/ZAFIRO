/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import tiendaderopa.Vistas.NavBarNL;
import tiendaderopa.Vistas.NavBarSLC;
import java.awt.BorderLayout;
import tiendaderopa.Controladores.InicioCont;

/**
 *
 * @author valen
 */
public class HomeC extends javax.swing.JPanel {
    
    /**
     * Creates new form home
     */
    boolean login = false;
    NavBarNL barraNavegacionN = new NavBarNL();
    NavBarSLC barraNavegacionS = new NavBarSLC();
    
    public HomeC() {
        initComponents(); 
        this.setLayout(new BorderLayout()); 
        generarPagina(); 
        
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(248, 248, 248));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        fondo.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1270, 500));

        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 650));
    }// </editor-fold>//GEN-END:initComponents

    
    private void generarContenido(){
        
    }
    
    private void generarPagina(){
        
        if (login) {
            this.add(barraNavegacionS, BorderLayout.NORTH);
            
        } else {
            this.add(barraNavegacionN, BorderLayout.NORTH);
            InicioCont controlador = new InicioCont(barraNavegacionN);
        }
        
        
   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    // End of variables declaration//GEN-END:variables


}
