/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author valen
 */
public class NavBarNL extends javax.swing.JPanel {

    /**
     * Creates new form NavBarNL
     */
    public NavBarNL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_registrar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        zafiro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrar.setBackground(new java.awt.Color(250, 250, 250));
        btn_registrar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        btn_registrar.setText("REGISTRARSE");
        btn_registrar.setBorder(null);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 150, 40));

        btn_ingresar.setBackground(new java.awt.Color(250, 250, 250));
        btn_ingresar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorder(null);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 140, 40));

        titulo.setFont(new java.awt.Font("Sylfaen", 0, 45)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("B  I  E  N  V  E  N  I  D  O");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 80));

        zafiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendaderopa/Vistas/imagenes/zafiro_50.jpg"))); // NOI18N
        zafiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(zafiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel zafiro;
    // End of variables declaration//GEN-END:variables

    
    public JButton getBtnIngresar(){
        return btn_ingresar;
    }
    
    public JButton getBtnRegistrar(){
        return btn_registrar;
    }
    
}
