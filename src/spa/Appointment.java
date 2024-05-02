/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package spa;

import com.toedter.calendar.JDateChooser;
import config.Connections;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Appointment extends javax.swing.JPanel {

    private String[][] serviceData = new String[100][4];

    Connections con = new Connections();
    Connection cn = con.conectar();

    public Appointment() {
        initComponents();
        serviceData = fillComboBoxs(combxService);
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
        lblService = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtFdDni = new javax.swing.JTextField();
        txtFdName = new javax.swing.JTextField();
        dChoDate = new com.toedter.calendar.JDateChooser();
        txtFdHour = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAppointment = new javax.swing.JTable();
        combxService = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));

        lblDni.setText("CC");

        lblName.setText("Nombre");

        lblService.setText("Servicio");

        lblHour.setText("Hora");

        lblDate.setText("Fecha");

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

        tableAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Hora", "Profesional", "Servicio"
            }
        ));
        jScrollPane1.setViewportView(tableAppointment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHour)
                        .addGap(9, 9, 9)
                        .addComponent(txtFdHour, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModify)
                            .addComponent(dChoDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblService)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combxService, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dChoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(lblHour)
                            .addComponent(txtFdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFdHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblService)
                            .addComponent(combxService, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblDate)
                            .addComponent(txtFdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (dChoDate.getDate() != null) {
            System.out.println("entro a dateConvert");
            String date = convertDate(dChoDate);
            String[] data = new String[5];

            if (dataIsEmpity(data, date) == false && checkDniCustomers(txtFdDni.getText()) == true) {
                System.out.println("entro dataIsEm y checkDNI");
                submitData(data);
            } else {
                JOptionPane.showMessageDialog(this, dataIsEmpity(data, date) ? "CAMPOS VACIOS." : "USUARIO NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "CAMPO FECHA VACIO.", "Error de campos sin llenar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private boolean dataIsEmpity(String[] data, String date) {
        data[0] = txtFdDni.getText();
        data[1] = txtFdName.getText();
        data[2] = txtFdHour.getText();
        data[3] = date;
        data[4] = combxService.getSelectedItem().toString();

        System.out.println("servicio " + data[4]);

        if (data[0].isEmpty() == false && data[1].isEmpty() == false && data[2].isEmpty() == false && data[3].isEmpty() == false && data[4].isEmpty() == false) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS VACIOS.", "Error de campos sin llenar", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private String convertDate(JDateChooser date) {
        String dateString;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date selectedDate = date.getDate();
            dateString = sdf.format(selectedDate);
            return dateString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private void submitData(String[] data) {
        //Hacer querys
        try {
            String query = "INSERT INTO appointments (time, name, last_name, address, phone_number, email, specialty, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, data[2]);
            pst.setString(2, data[0]);
            pst.setString(3, data[1]);
            pst.setString(4, data[3]);
            pst.setString(5, data[4]);

            System.out.println(pst.executeUpdate());

            pst.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            con.desconectar();
        }
    }

    private boolean checkDniCustomers(String dni) {
        boolean allow = false;

        try {
            String query = "SELECT COUNT(*) FROM customers WHERE dni = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, dni);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int rowCount = rs.getInt(1);
                allow = rowCount > 0;
            }
            rs.close();
            pst.close();
            //SQLException
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            con.desconectar();
        }
        return allow;
    }

    private String[][] fillComboBoxs(JComboBox<String> services) {
        try {
            String query = "SELECT s.id_services, s.type, s.professionals_dni, p.name, p.last_name FROM services AS s INNER JOIN professionals AS p ON s.professionals_dni = p.dni";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet resultSet = pst.executeQuery();

            // Initialize the two-dimensional array with an estimated size
            String[][] serviceData = new String[100][4];

            // Iterate through the ResultSet and populate the array
            int rowIndex = 0;
            while (resultSet.next()) {

                serviceData[rowIndex][0] = resultSet.getString("id_services");
                serviceData[rowIndex][1] = resultSet.getString("type");
                serviceData[rowIndex][2] = resultSet.getString("professionals_dni");
                serviceData[rowIndex][3] = resultSet.getString("name") + " " + resultSet.getString("last_name");

                if (!resultSet.wasNull()) {
                    services.addItem(serviceData[rowIndex][0] + "-" + serviceData[rowIndex][1] + "-" + serviceData[rowIndex][3]);
                }

                rowIndex++;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            con.desconectar();
        }

        return serviceData;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> combxService;
    private com.toedter.calendar.JDateChooser dChoDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblService;
    private javax.swing.JTable tableAppointment;
    private javax.swing.JTextField txtFdDni;
    private javax.swing.JTextField txtFdHour;
    private javax.swing.JTextField txtFdName;
    // End of variables declaration//GEN-END:variables
}
