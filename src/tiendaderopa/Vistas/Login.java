/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tiendaderopa.Vistas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author valen
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login_v2
     */
    public Login() {
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

        fondo_form = new javax.swing.JPanel();
        inicio_S = new javax.swing.JLabel();
        tit_uc = new javax.swing.JLabel();
        nomUser = new javax.swing.JTextField();
        separadorNC = new javax.swing.JSeparator();
        tit_contra = new javax.swing.JLabel();
        separadorC = new javax.swing.JSeparator();
        alertaUC = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        alertaC = new javax.swing.JLabel();
        alertaC1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagen_modelo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_form.setBackground(new java.awt.Color(0, 0, 51));
        fondo_form.setPreferredSize(new java.awt.Dimension(660, 650));
        fondo_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondo_formMouseEntered(evt);
            }
        });

        inicio_S.setFont(new java.awt.Font("Sylfaen", 1, 50)); // NOI18N
        inicio_S.setForeground(new java.awt.Color(255, 255, 255));
        inicio_S.setText("INICIO DE SESIÓN");

        tit_uc.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        tit_uc.setForeground(new java.awt.Color(255, 255, 255));
        tit_uc.setText("USUARIO  ");

        nomUser.setBackground(new java.awt.Color(0, 0, 51));
        nomUser.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        nomUser.setForeground(new java.awt.Color(153, 153, 153));
        nomUser.setText("Ingrese su nombre de usuario");
        nomUser.setBorder(null);
        nomUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nomUserMousePressed(evt);
            }
        });
        nomUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUserActionPerformed(evt);
            }
        });

        separadorNC.setBackground(new java.awt.Color(153, 153, 153));
        separadorNC.setForeground(new java.awt.Color(153, 153, 153));

        tit_contra.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        tit_contra.setForeground(new java.awt.Color(255, 255, 255));
        tit_contra.setText("CONTRASEÑA");

        separadorC.setBackground(new java.awt.Color(153, 153, 153));
        separadorC.setForeground(new java.awt.Color(153, 153, 153));

        alertaUC.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        alertaUC.setForeground(new java.awt.Color(0, 0, 51));
        alertaUC.setText("Alerta Usuario / Correo");

        contrasena.setBackground(new java.awt.Color(0, 0, 51));
        contrasena.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        contrasena.setForeground(new java.awt.Color(153, 153, 153));
        contrasena.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contrasena.setText("Ingrese su contraseña");
        contrasena.setBorder(null);
        contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaMousePressed(evt);
            }
        });

        alertaC.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        alertaC.setForeground(new java.awt.Color(0, 0, 51));
        alertaC.setText("Alerta contraseña");

        alertaC1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        alertaC1.setForeground(new java.awt.Color(0, 0, 51));
        alertaC1.setText("Alerta contraseña");

        btn_ingresar.setBackground(new java.awt.Color(250, 250, 250));
        btn_ingresar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 51));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorder(null);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondo_formLayout = new javax.swing.GroupLayout(fondo_form);
        fondo_form.setLayout(fondo_formLayout);
        fondo_formLayout.setHorizontalGroup(
            fondo_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_formLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(fondo_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tit_contra)
                        .addComponent(tit_uc)
                        .addComponent(inicio_S)
                        .addComponent(separadorNC)
                        .addComponent(nomUser, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addComponent(separadorC)
                        .addComponent(contrasena)
                        .addComponent(alertaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertaUC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertaC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        fondo_formLayout.setVerticalGroup(
            fondo_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_formLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(inicio_S, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(tit_uc)
                .addGap(18, 18, 18)
                .addComponent(nomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertaUC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(tit_contra)
                .addGap(18, 18, 18)
                .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorC, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertaC1)
                .addGap(55, 55, 55)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        add(fondo_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendaderopa/Vistas/imagenes/logo_zafiro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, 110));

        imagen_modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendaderopa/Vistas/imagenes/foto_modelo2.jpg"))); // NOI18N
        add(imagen_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -160, 780, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nomUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUserActionPerformed

    private void nomUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomUserMousePressed
        // TODO add your handling code here:
        if(nomUser.getText().equals("Ingrese su nombre de usuario o correo electronico")){
            nomUser.setText("");
            nomUser.setForeground(Color.white);
            separadorNC.setForeground(Color.white);
        }
        if(String.valueOf(contrasena.getPassword()).isEmpty()){
            contrasena.setText("Ingrese su contraseña");
            contrasena.setForeground(Color.GRAY);
            separadorC.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_nomUserMousePressed

    private void contrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaMousePressed
        // TODO add your handling code here:
        if(nomUser.getText().isEmpty()){
            nomUser.setText("Ingrese su nombre de usuario ");
            nomUser.setForeground(Color.GRAY);
            separadorNC.setForeground(Color.GRAY);
        }
        if(String.valueOf(contrasena.getPassword()).equals("Ingrese su contraseña")){
            contrasena.setText("");
            contrasena.setForeground(Color.white);
            separadorC.setForeground(Color.white);
        }
    }//GEN-LAST:event_contrasenaMousePressed

    private void fondo_formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo_formMouseEntered

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        // TODO add your handling code here:
        btn_ingresar.setBackground(new java.awt.Color(195,195,195)); // Color gris
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        // TODO add your handling code here:
        btn_ingresar.setBackground(new java.awt.Color(255,255,255)); // Color blanco
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El usuario \n" + nomUser.getText() + "\n" + String.valueOf(contrasena.getPassword()) + "\n" +"NO esta registrado ;_;", "Usuario NO registrado" , JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_ingresarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertaC;
    private javax.swing.JLabel alertaC1;
    private javax.swing.JLabel alertaUC;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JPanel fondo_form;
    private javax.swing.JLabel imagen_modelo;
    private javax.swing.JLabel inicio_S;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomUser;
    private javax.swing.JSeparator separadorC;
    private javax.swing.JSeparator separadorNC;
    private javax.swing.JLabel tit_contra;
    private javax.swing.JLabel tit_uc;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnIngresar(){
            return btn_ingresar;
    }
    
    public JTextField getNomUser(){
        return nomUser;
    }
    
    public JPasswordField getPass(){
        return contrasena;
    }
}
