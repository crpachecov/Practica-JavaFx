/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package spa;

import config.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Professionals extends javax.swing.JPanel {

    Connections con = new Connections();
    Connection cn = con.conectar();

    DefaultTableModel ta = new DefaultTableModel() {

        public boolean isCellEditable(int rows, int columns) {//Celdas no editables
            return false;
        }
    };

    public Professionals() {
        initComponents();

        String[] columnNames = {"Cedula", "Nombre", "Especialidad", "Telefono", "Email", "Dirección", "Contraseña"};
        ta.setColumnIdentifiers(columnNames);
        tableProfessionals.setModel(ta);
        tableProfessionals.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableProfessionals.getColumnModel().getColumn(3).setPreferredWidth(35);
        tableProfessionals.getColumnModel().getColumn(6).setPreferredWidth(35);

        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDni = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtFdName = new javax.swing.JTextField();
        txtFdAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProfessionals = new javax.swing.JTable();
        lblLastName = new javax.swing.JLabel();
        txtFdLastName = new javax.swing.JTextField();
        txtFdPhone = new javax.swing.JFormattedTextField();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtFdEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblSpeciality = new javax.swing.JLabel();
        txtFdSpecialization = new javax.swing.JTextField();
        txtFdPassword = new javax.swing.JPasswordField();
        txtFdDni = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));

        lblDni.setText("CC");

        lblName.setText("Nombre");

        lblAddress.setText("Dirección");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tableProfessionals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Especialidad", "Telefono"
            }
        ));
        tableProfessionals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProfessionalsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProfessionals);

        lblLastName.setText("Apellido");

        txtFdPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblPhone.setText("Telefono");

        lblEmail.setText("Email");

        lblPassword.setText("Contraseña");

        lblSpeciality.setText("Especialidad");

        txtFdDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastName)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFdLastName)
                                .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAddress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFdAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFdPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModify)
                            .addComponent(txtFdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSpeciality)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFdSpecialization, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btnDelete)
                    .addComponent(txtFdPassword))
                .addGap(19, 19, 19))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFdLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLastName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDni)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPhone)
                                        .addComponent(txtFdPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddress)
                                    .addComponent(txtFdAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEmail)
                                .addComponent(txtFdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFdSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpeciality))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModify)
                            .addComponent(btnDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String[] data = new String[8];
        String password = String.valueOf(txtFdPassword.getPassword());

        boolean allow = validatePassword(password);

        if (allow == true && dataIsEmpity(data, password) == true) {
            submitData(data);
        } else {

            JOptionPane.showMessageDialog(this, "La contraseña no debe contener los caracteres $,%,&,/,*,/,-,ñ.", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        String[] data = new String[8];
        String password = String.valueOf(txtFdPassword.getPassword());

        boolean allow = validatePassword(password);

        if (allow == true && dataIsEmpity(data, password) == true) {
            modifyData(data);
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña no debe contener los caracteres $,%,&,/,*,/,-,ñ.", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableProfessionalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProfessionalsMouseClicked
        //Seleciona una fila y envia a los textfield
        int selectedRow = tableProfessionals.getSelectedRow();
        String[] rowData = new String[8];

        for (int i = 0, j = 0; i < tableProfessionals.getColumnCount(); i++, j++) {
            String cellValue = tableProfessionals.getValueAt(selectedRow, i).toString();

            if (i == 1) {
                String[] namesProfessionals = cellValue.split(" ");
                rowData[j] = namesProfessionals[0].trim();
                rowData[j + 1] = namesProfessionals[1].trim();
            } else if (i == 2) {
                rowData[j + 1] = cellValue;
                j = 3; // Saltar al siguiente índice
            } else {
                rowData[j] = cellValue;
            }
        }
        setData(rowData);
    }//GEN-LAST:event_tableProfessionalsMouseClicked

    private void submitData(String[] data) {
        //Hacer querys
        try {
            String query = "INSERT INTO professionals (dni, name, last_name, address, phone_number, email, specialty, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, data[2]);
            pst.setString(2, data[0]);
            pst.setString(3, data[1]);
            pst.setString(4, data[3]);
            pst.setString(5, data[4]);
            pst.setString(6, data[5]);
            pst.setString(7, data[7]);
            pst.setString(8, data[6]);

            System.out.println(pst.executeUpdate());

            pst.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            fillTable();
            clearData();
        }
    }

    private void modifyData(String[] data) {
        //dni, name, last_name, address, phone_number, email, specialty, password
        int selectedRow = tableProfessionals.getSelectedRow();

        try {
            String query = "UPDATE professionals SET dni = ?, name = ?, last_name = ?, address = ?, phone_number = ?, email = ?, specialty = ?, password = ? WHERE dni = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, data[2]);
            pst.setString(2, data[0]);
            pst.setString(3, data[1]);
            pst.setString(4, data[3]);
            pst.setString(5, data[4]);
            pst.setString(6, data[5]);
            pst.setString(7, data[7]);
            pst.setString(8, data[6]);
            pst.setString(9, tableProfessionals.getValueAt(selectedRow, 0).toString());
            
            System.out.println("Filas actualizadas: " + pst.executeUpdate());

            pst.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            fillTable();
            clearData();
        }
    }

    private void deleteData() {
        int selectedRow = tableProfessionals.getSelectedRow();

        try {
            String query = "DELETE FROM professionals WHERE dni = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, tableProfessionals.getValueAt(selectedRow, 0).toString());

            pst.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            clearData();
            fillTable();
        }
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

        if ((data[0].isEmpty() == false && data[1].isEmpty() == false && data[2].isEmpty() == false && data[3].isEmpty() == false && data[4].isEmpty() == false && data[5].isEmpty() == false && data[6].isEmpty() == false && data[7].isEmpty() == false)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS VACIOS.", "Error de campos sin llenar", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private void fillTable() {
        //"Cedula", "Nombre", "Especialidad", "Telefono", "Email", "Dirección", "Contraseña"
        ta.setRowCount(0);
        String[][] dataTbA = new String[100][7];
        try {
            String query = "SELECT dni, name, last_name, address, phone_number, email, specialty, password FROM professionals";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet resultSet = pst.executeQuery();

            // Iterate through the ResultSet and populate the array
            int rowIndex = 0;
            while (resultSet.next()) {

                dataTbA[rowIndex][0] = resultSet.getString("dni");;
                dataTbA[rowIndex][1] = resultSet.getString("name") + " " + resultSet.getString("last_name");
                dataTbA[rowIndex][2] = resultSet.getString("address");
                dataTbA[rowIndex][3] = resultSet.getString("phone_number");
                dataTbA[rowIndex][4] = resultSet.getString("email");
                dataTbA[rowIndex][5] = resultSet.getString("specialty");
                dataTbA[rowIndex][6] = resultSet.getString("password");

                ta.addRow(new Object[]{dataTbA[rowIndex][0], dataTbA[rowIndex][1], dataTbA[rowIndex][5], dataTbA[rowIndex][3], dataTbA[rowIndex][4], dataTbA[rowIndex][2], dataTbA[rowIndex][6]});
                rowIndex++;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void setData(String[] data) {
        //"Cedula", "Nombre", "Especialidad", "Telefono", "Email", "Dirección", "Contraseña"
        txtFdDni.setText(data[0]);
        txtFdName.setText(data[1]);
        txtFdLastName.setText(data[2]);
        txtFdAddress.setText(data[6]);
        txtFdPhone.setText(data[4]);
        txtFdEmail.setText(data[5]);
        txtFdSpecialization.setText(data[3]);
        txtFdPassword.setText(data[7]);
    }

    private void clearData() {
        txtFdDni.setText("");
        txtFdName.setText("");
        txtFdLastName.setText("");
        txtFdAddress.setText("");
        txtFdPhone.setText("");
        txtFdEmail.setText("");
        txtFdSpecialization.setText("");
        txtFdPassword.setText("");
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JTable tableProfessionals;
    private javax.swing.JTextField txtFdAddress;
    private javax.swing.JFormattedTextField txtFdDni;
    private javax.swing.JTextField txtFdEmail;
    private javax.swing.JTextField txtFdLastName;
    private javax.swing.JTextField txtFdName;
    private javax.swing.JPasswordField txtFdPassword;
    private javax.swing.JFormattedTextField txtFdPhone;
    private javax.swing.JTextField txtFdSpecialization;
    // End of variables declaration//GEN-END:variables
}
