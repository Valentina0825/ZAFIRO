/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import tiendaderopa.Controladores.PestProductoCont;
import tiendaderopa.Modelos.Producto;

/**
 *
 * @author valen
 */
public class PanelProducto extends javax.swing.JPanel {
    private Producto produc;

    /**
     * Creates new form PanelProducto
     */
    public PanelProducto(Producto producto) {
        this.produc = producto;
        initComponents();
        nom_producto.setText(produc.getNombre_prod());
        precio.setText("$" + produc.getPrecio_prod());

        // Cargar imagen desde la ruta
        if (produc.getImg_prod() != null && !produc.getImg_prod().isEmpty()) {
            img_icon.setIcon(new ImageIcon(getClass().getResource("/tiendaderopa/Vistas/imagenes/imgs_productos/" + produc.getImg_prod())));
        }
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
        btn_detalle = new javax.swing.JButton();

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

        btn_detalle.setBackground(new java.awt.Color(204, 204, 204));
        btn_detalle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_detalle.setForeground(new java.awt.Color(0, 0, 51));
        btn_detalle.setText(">");
        btn_detalle.setBorder(null);
        btn_detalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_detalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_detalle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_detalle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_detalle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_detalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_detalleMouseExited(evt);
            }
        });
        btn_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_productoLayout = new javax.swing.GroupLayout(pnl_producto);
        pnl_producto.setLayout(pnl_productoLayout);
        pnl_productoLayout.setHorizontalGroup(
            pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productoLayout.createSequentialGroup()
                .addGroup(pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nom_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_productoLayout.setVerticalGroup(
            pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_productoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_productoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio)
                        .addContainerGap())))
        );

        add(pnl_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalleActionPerformed
        // TODO add your handling code here:
        //DetProductoCont.mostrarDetalle(produc);
    }//GEN-LAST:event_btn_detalleActionPerformed

    private void btn_detalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detalleMouseEntered
        // TODO add your handling code here:
        btn_detalle.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_detalleMouseEntered

    private void btn_detalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detalleMouseExited
        // TODO add your handling code here:
         btn_detalle.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_btn_detalleMouseExited
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detalle;
    private javax.swing.JLabel img_icon;
    private javax.swing.JLabel nom_producto;
    private tiendaderopa.Vistas.PanelRound pnl_producto;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_detalle() {
        return btn_detalle;
    }
    

}
