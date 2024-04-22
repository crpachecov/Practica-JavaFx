/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spa;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContainer = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtFdName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtFdLastName = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtFdDni = new javax.swing.JFormattedTextField();
        lblAddress = new javax.swing.JLabel();
        txtFdAddress = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtFdPhone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtFdEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        lblSpecialization = new javax.swing.JLabel();
        txtFdSpecialization = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpContainer.setBackground(new java.awt.Color(102, 102, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("REGISTRO");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setText("Nombre");

        lblLastName.setText("Apellido");

        lblDni.setText("N. Cedula");

        try {
            txtFdDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblAddress.setText("Dirección");

        lblPhone.setText("Telefono");

        try {
            txtFdPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setText("Email");

        lblPassword.setText("Contraseña");

        lblSpecialization.setText("Especialidad");

        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(164, 164, 164))
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContainerLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpContainerLayout.createSequentialGroup()
                                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFdLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpContainerLayout.createSequentialGroup()
                                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblDni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFdAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(txtFdDni)))
                            .addGroup(jpContainerLayout.createSequentialGroup()
                                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpContainerLayout.createSequentialGroup()
                                        .addComponent(lblPhone)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtFdPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpContainerLayout.createSequentialGroup()
                                        .addComponent(lblSpecialization)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFdSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpContainerLayout.createSequentialGroup()
                                        .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPassword)
                                            .addComponent(lblEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(10, 10, 10)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtFdLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtFdDni, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtFdAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtFdPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtFdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialization)
                    .addComponent(txtFdSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnRegister)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Login lg = new Login();
        lg.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String[] data = new String[8];
        char[] passwordChars = fieldPassword.getPassword();
        String password = new String(passwordChars);

        boolean allow = validatePassword(password);
        if (allow == true && dataIsEmpity(data,password)==true) {
            submitData(data);
            Login lg = new Login();
            lg.setVisible(true);

            //Close current window
            dispose();
        } else {

            JOptionPane.showMessageDialog(this, "La contraseña no debe contener los caracteres $,%,&,/,*,/,-,ñ.", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    private boolean dataIsEmpity(String[] data, String password) {
        data[0] = txtFdName.getText();
        data[1] = txtFdLastName.getText();
        data[2] = txtFdDni.getText();
        data[3] = txtFdAddress.getText();
        data[4] = txtFdPhone.getText();
        data[5] = txtFdEmail.getText();
        data[6] = password;
        data[7] = txtFdSpecialization.getText();

        if ((data[0].isEmpty() == true && data[1].isEmpty() == true && data[2].isEmpty() == true && data[3].isEmpty() == true && data[4].isEmpty() == true && data[5].isEmpty() == true && data[6].isEmpty()) == true && data[7].isEmpty() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS VACIOS.", "Error de campos sin llenar", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
     private void submitData(String[] data) {
        //Hacer querys
    }

    private boolean validatePassword(String password) {
        String charactersDeny = "$,%,&,/,*,/,-,ñ";

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (charactersDeny.indexOf(character) != -1) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFdAddress;
    private javax.swing.JFormattedTextField txtFdDni;
    private javax.swing.JTextField txtFdEmail;
    private javax.swing.JTextField txtFdLastName;
    private javax.swing.JTextField txtFdName;
    private javax.swing.JFormattedTextField txtFdPhone;
    private javax.swing.JTextField txtFdSpecialization;
    // End of variables declaration//GEN-END:variables

}
