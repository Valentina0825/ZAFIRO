/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import java.awt.Color;

/**
 *
 * @author valen
 */
public class PanelProducto extends javax.swing.JPanel {

    /**
     * Creates new form PanelProducto
     */
    public PanelProducto() {
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

        pnl_producto = new tiendaderopa.Vistas.PanelRound();
        img_icon = new javax.swing.JLabel();
        nom_producto = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        btn_detalle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 248, 248));
        setPreferredSize(new java.awt.Dimension(280, 380));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_producto.setBackground(new java.awt.Color(204, 204, 204));
        pnl_producto.setRoundBottomLeft(40);
        pnl_producto.setRoundBottomRight(40);
        pnl_producto.setRoundTopLeft(40);
        pnl_producto.setRoundTopRight(40);

        nom_producto.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        nom_producto.setForeground(new java.awt.Color(0, 0, 51));
        nom_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom_producto.setText("Camisa Hombro Descubierto Manga Larga");
        nom_producto.setToolTipText("");

        precio.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 0, 51));
        precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio.setText("PRECIO");

        btn_detalle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_detalle.setForeground(new java.awt.Color(0, 0, 51));
        btn_detalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_detalle.setText(">");
        btn_detalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detalleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_detalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_detalleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_productoLayout = new javax.swing.GroupLayout(pnl_producto);
        pnl_producto.setLayout(pnl_productoLayout);
        pnl_productoLayout.setHorizontalGroup(
            pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productoLayout.createSequentialGroup()
                .addGroup(pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(nom_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_productoLayout.setVerticalGroup(
            pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nom_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(pnl_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detalleMouseEntered
        // TODO add your handling code here:
        btn_detalle.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detalleMouseEntered

    private void btn_detalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detalleMouseExited
        // TODO add your handling code here:
        btn_detalle.setForeground(new Color(0, 0, 51));
    }//GEN-LAST:event_btn_detalleMouseExited

    private void btn_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detalleMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_detalleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_detalle;
    private javax.swing.JLabel img_icon;
    private javax.swing.JLabel nom_producto;
    private tiendaderopa.Vistas.PanelRound pnl_producto;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
