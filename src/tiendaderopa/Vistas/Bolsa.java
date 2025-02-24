/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author valen
 */
public class Bolsa extends javax.swing.JPanel {

    /**
     * Creates new form Bolsa
     */
    public Bolsa() {
        initComponents();
        opcionesPago.add(trj_credito);
        opcionesPago.add(trj_debito);
        opcionesPago.add(consignacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesPago = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnl_direccion = new tiendaderopa.Vistas.PanelRound();
        codigo_post = new javax.swing.JTextField();
        separadorCP = new javax.swing.JSeparator();
        direccion = new javax.swing.JTextField();
        separadorDir = new javax.swing.JSeparator();
        complemento = new javax.swing.JTextField();
        separadorCom = new javax.swing.JSeparator();
        tit_direccion = new javax.swing.JLabel();
        check_dir = new javax.swing.JButton();
        panel_pago = new tiendaderopa.Vistas.PanelRound();
        tit_direccion1 = new javax.swing.JLabel();
        tit_direccion2 = new javax.swing.JLabel();
        tit_direccion3 = new javax.swing.JLabel();
        trj_credito = new javax.swing.JRadioButton();
        trj_debito = new javax.swing.JRadioButton();
        consignacion = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 680, 530));

        pnl_direccion.setBackground(new java.awt.Color(204, 204, 204));
        pnl_direccion.setRoundBottomLeft(40);
        pnl_direccion.setRoundBottomRight(40);
        pnl_direccion.setRoundTopLeft(40);
        pnl_direccion.setRoundTopRight(40);

        codigo_post.setBackground(new java.awt.Color(204, 204, 204));
        codigo_post.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        codigo_post.setForeground(new java.awt.Color(153, 153, 153));
        codigo_post.setText("Ingrese su nombre de usuario");
        codigo_post.setBorder(null);
        codigo_post.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigo_postMousePressed(evt);
            }
        });
        codigo_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_postActionPerformed(evt);
            }
        });

        separadorCP.setBackground(new java.awt.Color(153, 153, 153));
        separadorCP.setForeground(new java.awt.Color(153, 153, 153));

        direccion.setBackground(new java.awt.Color(204, 204, 204));
        direccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(153, 153, 153));
        direccion.setText("Ingrese su nombre de usuario");
        direccion.setBorder(null);
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionMousePressed(evt);
            }
        });
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        separadorDir.setBackground(new java.awt.Color(153, 153, 153));
        separadorDir.setForeground(new java.awt.Color(153, 153, 153));

        complemento.setBackground(new java.awt.Color(204, 204, 204));
        complemento.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        complemento.setForeground(new java.awt.Color(153, 153, 153));
        complemento.setText("Ingrese su nombre de usuario");
        complemento.setBorder(null);
        complemento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                complementoMousePressed(evt);
            }
        });
        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoActionPerformed(evt);
            }
        });

        separadorCom.setBackground(new java.awt.Color(153, 153, 153));
        separadorCom.setForeground(new java.awt.Color(153, 153, 153));

        tit_direccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tit_direccion.setForeground(new java.awt.Color(0, 0, 51));
        tit_direccion.setText("Direccion de envio");

        check_dir.setBackground(new java.awt.Color(0, 0, 51));
        check_dir.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        check_dir.setForeground(new java.awt.Color(255, 255, 255));
        check_dir.setBorder(null);

        javax.swing.GroupLayout pnl_direccionLayout = new javax.swing.GroupLayout(pnl_direccion);
        pnl_direccion.setLayout(pnl_direccionLayout);
        pnl_direccionLayout.setHorizontalGroup(
            pnl_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_direccionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tit_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(separadorCom)
                        .addComponent(separadorDir)
                        .addComponent(separadorCP)
                        .addComponent(codigo_post, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                        .addComponent(direccion)
                        .addComponent(complemento))
                    .addComponent(check_dir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_direccionLayout.setVerticalGroup(
            pnl_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_direccionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tit_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codigo_post, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorCP, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(pnl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 530, 240));

        panel_pago.setBackground(new java.awt.Color(204, 204, 204));
        panel_pago.setRoundBottomLeft(40);
        panel_pago.setRoundBottomRight(40);
        panel_pago.setRoundTopLeft(40);
        panel_pago.setRoundTopRight(40);

        tit_direccion1.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tit_direccion1.setForeground(new java.awt.Color(0, 0, 51));
        tit_direccion1.setText("Total a pagar:");

        tit_direccion2.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        tit_direccion2.setForeground(new java.awt.Color(0, 0, 51));
        tit_direccion2.setText("$$$$$$$$$$");

        tit_direccion3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        tit_direccion3.setForeground(new java.awt.Color(0, 0, 51));
        tit_direccion3.setText("Seleccione metodo de pago:");

        trj_credito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trj_credito.setText("Tarjeta de Credito");
        trj_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trj_creditoActionPerformed(evt);
            }
        });

        trj_debito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trj_debito.setText("Consignación");
        trj_debito.setToolTipText("");
        trj_debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trj_debitoActionPerformed(evt);
            }
        });

        consignacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consignacion.setText("Tarjeta deDebito");
        consignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consignacionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PAGAR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_pagoLayout = new javax.swing.GroupLayout(panel_pago);
        panel_pago.setLayout(panel_pagoLayout);
        panel_pagoLayout.setHorizontalGroup(
            panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pagoLayout.createSequentialGroup()
                        .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tit_direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tit_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tit_direccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_pagoLayout.createSequentialGroup()
                        .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_pagoLayout.createSequentialGroup()
                                .addComponent(trj_credito)
                                .addGap(48, 48, 48)
                                .addComponent(consignacion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(trj_debito)
                        .addGap(32, 32, 32))))
        );
        panel_pagoLayout.setVerticalGroup(
            panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pagoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tit_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tit_direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tit_direccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panel_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trj_credito)
                    .addComponent(trj_debito)
                    .addComponent(consignacion))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(panel_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 530, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void codigo_postMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigo_postMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codigo_postMousePressed

    private void codigo_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_postActionPerformed

    private void direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionMousePressed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void complementoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complementoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoMousePressed

    private void complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoActionPerformed

    private void trj_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trj_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trj_creditoActionPerformed

    private void trj_debitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trj_debitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trj_debitoActionPerformed

    private void consignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consignacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consignacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check_dir;
    private javax.swing.JTextField codigo_post;
    private javax.swing.JTextField complemento;
    private javax.swing.JRadioButton consignacion;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup opcionesPago;
    private tiendaderopa.Vistas.PanelRound panel_pago;
    private tiendaderopa.Vistas.PanelRound pnl_direccion;
    private javax.swing.JSeparator separadorCP;
    private javax.swing.JSeparator separadorCom;
    private javax.swing.JSeparator separadorDir;
    private javax.swing.JLabel tit_direccion;
    private javax.swing.JLabel tit_direccion1;
    private javax.swing.JLabel tit_direccion2;
    private javax.swing.JLabel tit_direccion3;
    private javax.swing.JRadioButton trj_credito;
    private javax.swing.JRadioButton trj_debito;
    // End of variables declaration//GEN-END:variables

    public JButton getCheck_dir() {
        return check_dir;
    }

    public JTextField getCodigo_post() {
        return codigo_post;
    }

    public JTextField getComplemento() {
        return complemento;
    }

    public JRadioButton getConsignacion() {
        return consignacion;
    }

    public JTextField getDireccion() {
        return direccion;
    }

    public ButtonGroup getOpcionesPago() {
        return opcionesPago;
    }

    public JRadioButton getTrj_credito() {
        return trj_credito;
    }

    public JRadioButton getTrj_debito() {
        return trj_debito;
    }



}
