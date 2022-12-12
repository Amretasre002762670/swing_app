/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import Model.Customer.Customer;
import Model.DeliveryMan.DeliveryMan;
import Model.DeliveryMan.DeliveryManDirectory;
import Model.System.Ecosystem;
import Model.Employee.Employee;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author puppalanagavaishnavi
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem ecosystem;
    private DeliveryMan deliveryMan;
    DeliveryManDirectory deliveryManList;
    DeliveryMan updateDel;
    int row = 0;

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    public ManageDeliveryManJPanel(JPanel userProcessContainer, UserAccount account, Ecosystem ecosystem, DeliveryManDirectory deliveryManList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.deliveryManList = deliveryManList;
        populateTable();
//        populateComboBox();
    }

    public void sendUserAccountDetails(UserAccount userAccount) {
        String queryDeliveryManTable = "INSERT INTO User_Account_Directory (user_name, user_password, user_role) VALUES (?, ?, ?);";

        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Delivery_system",
                    "root", "amre1999");

            PreparedStatement st_DeliveryManTable = (PreparedStatement) connection
                    .prepareStatement(queryDeliveryManTable);

            st_DeliveryManTable.setString(1, userAccount.getUsername());
            st_DeliveryManTable.setString(2, userAccount.getPassword());
            st_DeliveryManTable.setString(3, userAccount.getRole());

            st_DeliveryManTable.execute();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
    }

    public int getUserIdForUserCreated(UserAccount user) {
        String queryDeliveryManTable = "SELECT user_id FROM User_Account_Directory WHERE user_name=?;";
        int del_id = 0;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Delivery_system",
                    "root", "amre1999");

            PreparedStatement st_DeliveryManTable = (PreparedStatement) connection
                    .prepareStatement(queryDeliveryManTable);

            st_DeliveryManTable.setString(1, user.getUsername());

            ResultSet rs = st_DeliveryManTable.executeQuery();

            while (rs.next()) {
                del_id = rs.getInt("user_id");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return del_id;
    }

    public void sendDeliveryManToDB(DeliveryMan d) {
        String queryDeliveryManTable = "INSERT INTO DeliveryMan_Directory (deliveryman_name, area_covered, deliveryman_phoneNumber, user_id, user_name) VALUES (?,?,?,?,?);";
        int del_id = 0;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Delivery_system",
                    "root", "amre1999");

            PreparedStatement st_DeliveryManTable = (PreparedStatement) connection
                    .prepareStatement(queryDeliveryManTable);

            st_DeliveryManTable.setString(1, d.getDeliveryManName());
            st_DeliveryManTable.setString(2, d.getCommunity());
            st_DeliveryManTable.setLong(3, d.getDeliveryManNumber());

            UserAccount user = new UserAccount();
            user.setUsername(d.getUserAccount().getUsername());
            user.setPassword(d.getUserAccount().getPassword());

            del_id = getUserIdForUserCreated(user);

            st_DeliveryManTable.setInt(4, del_id);
            st_DeliveryManTable.setString(5, d.getUserAccount().getUsername());

            st_DeliveryManTable.execute();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryManJTable = new javax.swing.JTable();
        lblDelUsername = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        txtDeliveryManPassword = new javax.swing.JPasswordField();
        txtDeliveryManUserName = new javax.swing.JTextField();
        lblDelPassword = new javax.swing.JLabel();
        btnUpdateDeli = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblDelCom = new javax.swing.JLabel();
        txtDeliverManCommunity = new javax.swing.JTextField();
        txtDeliverManName = new javax.swing.JTextField();
        lblDelname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setPreferredSize(new java.awt.Dimension(650, 650));

        deliveryManJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Name", "Community", "User Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveryManJTable);

        lblDelUsername.setText("Username:");

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(204, 255, 204));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        lblDelPassword.setText("Password:");

        btnUpdateDeli.setBackground(new java.awt.Color(204, 255, 204));
        btnUpdateDeli.setText("Update");
        btnUpdateDeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeliActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(204, 255, 204));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblDelCom.setText("Community:");

        lblDelname.setText("Name:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Man Panel");

        jLabel2.setText("Phone Number: ");

        txtPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyReleased(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 0, 0));
        lblBack.setText("<< Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateDeli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDelUsername)
                            .addComponent(lblDelCom)
                            .addComponent(lblDelPassword)
                            .addComponent(lblDelname)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeliveryManUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeliveryManPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeliverManCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeliverManName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, lblDelCom, lblDelPassword, lblDelUsername, lblDelname});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDeliverManCommunity, txtDeliverManName, txtDeliveryManPassword, txtDeliveryManUserName, txtPhoneNum});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBack)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDelname)
                            .addComponent(txtDeliverManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDelCom)
                            .addComponent(txtDeliverManCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDelUsername)
                            .addComponent(txtDeliveryManUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDelPassword)
                            .addComponent(txtDeliveryManPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdateDeli)
                    .addComponent(btnDelete)
                    .addComponent(saveBtn))
                .addGap(179, 179, 179))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = deliveryManJTable.getSelectedRow();
        if (selectedRow >= 0) {
            DeliveryMan d = (DeliveryMan) deliveryManJTable.getValueAt(selectedRow, 0);
            deliveryManList.removeCustomer(d);
            JOptionPane.showMessageDialog(null, "Delivery man removed Successfully.");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        UserAccount user = new UserAccount();

        updateDel.setCommunity(txtDeliverManCommunity.getText());
        updateDel.setDeliveryManName(txtDeliverManName.getText());
        updateDel.setDeliveryManNumber(Long.parseLong(txtPhoneNum.getText()));

        user.setUsername(txtDeliveryManUserName.getText());
        user.setPassword(txtDeliveryManPassword.getText());
        updateDel.setUserAccount(user);

        JOptionPane.showMessageDialog(null, "Deliveryman Updated Successfully.");

        populateTable();
//        txtDeliveryManID.setText("");
        txtDeliverManName.setText("");
        txtDeliverManCommunity.setText("");
        txtDeliveryManPassword.setText("");
        txtDeliveryManUserName.setText("");
        txtPhoneNum.setText("");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void btnUpdateDeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeliActionPerformed
        // TODO add your handling code here:
        int selectedRow = deliveryManJTable.getSelectedRow();

        row = selectedRow;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        DefaultTableModel deliverManTbl = (DefaultTableModel) deliveryManJTable.getModel();
        DeliveryMan del = (DeliveryMan) deliverManTbl.getValueAt(selectedRow, 0);

        txtDeliverManName.setText(del.getDeliveryManName());
        txtDeliverManCommunity.setText(del.getCommunity());
        txtDeliveryManUserName.setText(del.getUserAccount().getUsername());
        txtDeliveryManPassword.setText(del.getUserAccount().getPassword());
        txtPhoneNum.setText(String.valueOf(del.getDeliveryManNumber()));

        updateDel = deliveryManList.updateDeliveryMan(del, selectedRow);

    }//GEN-LAST:event_btnUpdateDeliActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        if (txtDeliveryManUserName.getText().length() <= 0 || String.valueOf(txtDeliveryManPassword.getPassword()).length() <= 0
                || txtDeliverManName.getText().length() <= 0 || txtDeliverManCommunity.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, " One or more fields are empty.");
        }
        String username = txtDeliveryManUserName.getText();
        String password = String.valueOf(txtDeliveryManPassword.getPassword());
        String new_role = "DeliveryMan";
        String name = txtDeliverManName.getText();
        //int DelId = Integer.parseInt(txtDeliveryManID.getText());
        int phonenumber = Integer.parseInt(txtPhoneNum.getText());
        String community = txtDeliverManCommunity.getText();

        // Employee employee = ecosystem.getEmployeeList().createEmployee(name);
        // getEmployeeDirectory().createEmployee(name);
        UserAccount account = ecosystem.getUserAccountDir().AddUserAccount();
        // getUserAccountDirectory().createUserAccount(username, password, employee, new DeliverManRole());
        account.setUsername(username);
        account.setPassword(password);
        account.setRole("DeliveryMan");

        DeliveryMan d = deliveryManList.addDeliveryManWithUserAcct(account);
        d.setCommunity(community);
        d.setDeliveryManName(name);
        d.setDeliveryManNumber(phonenumber);

        txtDeliverManName.setText("");
        txtDeliverManCommunity.setText("");
        //   txtDeliveryManPhoneNum.setText("");
        txtDeliveryManUserName.setText("");
        txtDeliveryManPassword.setText("");

        populateTable();

        sendUserAccountDetails(account);
//        int cus_id = getUserIdForUserCreated(account);
//        System.out.println(cus_id);
        sendDeliveryManToDB(d);
        //JOptionPane.showMessageDialog(this, "Delivery Man has been Created");

        txtPhoneNum.setText("");
        txtDeliverManName.setText("");
        txtDeliverManCommunity.setText("");
        txtDeliveryManUserName.setText("");
        txtDeliveryManPassword.setText("");
        txtPhoneNum.setText("");
        JOptionPane.showMessageDialog(this, "Delivery Man has been Created");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPhoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            jLabel3.setText("Please Enter Number only");
        } else {
            jLabel3.setText("");
        }
    }//GEN-LAST:event_txtPhoneNumKeyPressed

    private void txtPhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyReleased
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
//            jLabel7.setText("Please Enter Number only");
            txtPhoneNum.setText("");
        }
    }//GEN-LAST:event_txtPhoneNumKeyReleased

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        // TODO add your handling code here:
        lblBack.setForeground(Color.blue);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        // TODO add your handling code here:
        lblBack.setForeground(Color.red);

    }//GEN-LAST:event_lblBackMouseExited

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        // sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_lblBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateDeli;
    private javax.swing.JTable deliveryManJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDelCom;
    private javax.swing.JLabel lblDelPassword;
    private javax.swing.JLabel lblDelUsername;
    private javax.swing.JLabel lblDelname;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtDeliverManCommunity;
    private javax.swing.JTextField txtDeliverManName;
    private javax.swing.JPasswordField txtDeliveryManPassword;
    private javax.swing.JTextField txtDeliveryManUserName;
    private javax.swing.JTextField txtPhoneNum;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) deliveryManJTable.getModel();

        model.setRowCount(0);

        for (DeliveryMan deliveryMan : deliveryManList.getDeliveryManList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = deliveryMan;
            row[1] = deliveryMan.getCommunity();
            row[2] = deliveryMan.getUserAccount().getUsername();
            row[3] = deliveryMan.getDeliveryManNumber();

            model.addRow(row);
        }
    }

//    private void populateComboBox() {
//     delComboBox.removeAllItems();
//       delComboBox.addItem(Role.RoleType.DeliveryMan.toString());   
//}
}
