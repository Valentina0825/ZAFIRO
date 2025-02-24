/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import tiendaderopa.Controladores.ContenidoCont;

/**
 *
 * @author valen
 */
public class HomeC extends JPanel {
    
    /**
     * Creates new form home
     */
    
    public HomeC() {
        
        initComponents(); 
        generarContenido();
        generarPagina(); 
        
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(248, 248, 248));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(248, 248, 248));
        jScrollPane1.setBorder(null);

        contenido.setBackground(new java.awt.Color(248, 248, 248));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 1280, 540));
    }// </editor-fold>//GEN-END:initComponents


    private void generarContenido(){
        new ContenidoCont(contenido);
    }
    
    private void generarPagina(){
        
        jScrollPane1.setViewportBorder(new EmptyBorder(20, 20, 20, 20));
        revalidate();
        repaint();
   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    

}
