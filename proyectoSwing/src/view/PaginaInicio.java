/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Conexion;

/**
 *
 * @author Windows
 */
public class PaginaInicio extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicio
     */
    public PaginaInicio() {
        initComponents();
        transparencia();
        Conexion conn1= new Conexion();
        conn1.Conexion();
    }
    
    public void transparencia (){
        Buentrar.setOpaque(false);
        Buentrar.setContentAreaFilled(false);
        Buentrar.setBorderPainted(false);
        Buregistrarse.setOpaque(false);
        Buregistrarse.setContentAreaFilled(false);
        Buregistrarse.setBorderPainted(false);
        Buolvidarcont.setOpaque(false);
        Buolvidarcont.setContentAreaFilled(false);
        Buolvidarcont.setBorderPainted(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Buentrar = new javax.swing.JButton();
        Buregistrarse = new javax.swing.JButton();
        Buolvidarcont = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        FieldUsuario = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buentrar.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.Buentrar.text")); // NOI18N
        Buentrar.setToolTipText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.Buentrar.toolTipText")); // NOI18N
        Buentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuentrarActionPerformed(evt);
            }
        });
        jPanel1.add(Buentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 210, 40));

        Buregistrarse.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.Buregistrarse.text")); // NOI18N
        Buregistrarse.setToolTipText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.Buregistrarse.toolTipText")); // NOI18N
        Buregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuregistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Buregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 250, 40));

        Buolvidarcont.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Buolvidarcont.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.Buolvidarcont.text")); // NOI18N
        Buolvidarcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuolvidarcontActionPerformed(evt);
            }
        });
        jPanel1.add(Buolvidarcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField1.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.jTextField1.text")); // NOI18N
        jTextField1.setToolTipText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.jTextField1.toolTipText")); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 270, 380, 30));

        FieldUsuario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        FieldUsuario.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.FieldUsuario.text")); // NOI18N
        FieldUsuario.setToolTipText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.FieldUsuario.toolTipText")); // NOI18N
        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(FieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 210, 380, 30));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.jCheckBox1.text")); // NOI18N
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 310, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 490, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/inicioPrin.jpg"))); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(PaginaInicio.class, "PaginaInicio.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuentrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuentrarActionPerformed

    private void BuolvidarcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuolvidarcontActionPerformed
        RecuperarContraseña rc= new RecuperarContraseña();
        rc.setVisible(true);
    }//GEN-LAST:event_BuolvidarcontActionPerformed

    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void BuregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuregistrarseActionPerformed
        Registrarse r1= new Registrarse();
        r1.setVisible(true);
    }//GEN-LAST:event_BuregistrarseActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buentrar;
    private javax.swing.JButton Buolvidarcont;
    private javax.swing.JButton Buregistrarse;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
