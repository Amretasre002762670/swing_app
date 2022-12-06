/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DeliveryManWorkArea;

import java.awt.CardLayout;
import javax.swing.JPanel;
import UI.DeliveryManWorkArea.ViewQueue;

/**
 *
 * @author SRADDHA
 */
public class DeliveryManWorkArea extends javax.swing.JPanel {
    private JPanel userprocessContainer;

    /**
     * Creates new form DeliveryManWorkArea
     */
    javax.swing.JPanel panelBackWorkArea;
    public DeliveryManWorkArea(javax.swing.JPanel panelBackWorkArea) {
        initComponents();
        this.panelBackWorkArea = panelBackWorkArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titledeliverylbl = new javax.swing.JLabel();
        lblpic = new javax.swing.JLabel();
        btndelviewqueue = new javax.swing.JButton();
        btndelorders = new javax.swing.JButton();
        btndelcuroders = new javax.swing.JButton();
        lbldelloggedin = new javax.swing.JLabel();
        txtloggedin = new javax.swing.JTextField();
        lbllogout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        titledeliverylbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titledeliverylbl.setForeground(new java.awt.Color(255, 102, 51));
        titledeliverylbl.setText("DELIVERY MAN WORK AREA");

        lblpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\SRADDHA\\Downloads\\SS.png")); // NOI18N

        btndelviewqueue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelviewqueue.setText("View Order Queue");
        btndelviewqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelviewqueueActionPerformed(evt);
            }
        });

        btndelorders.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelorders.setText("View Delivered orders");

        btndelcuroders.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelcuroders.setText("Current Order");
        btndelcuroders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelcurodersActionPerformed(evt);
            }
        });

        lbldelloggedin.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbldelloggedin.setText("Logged in as :");

        lbllogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbllogout.setForeground(new java.awt.Color(255, 51, 51));
        lbllogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btndelcuroders))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndelorders, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btndelviewqueue, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(131, 131, 131)
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(titledeliverylbl)
                        .addGap(150, 150, 150)
                        .addComponent(lbllogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lbldelloggedin)
                        .addGap(30, 30, 30)
                        .addComponent(txtloggedin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btndelcuroders, btndelorders, btndelviewqueue});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titledeliverylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllogout))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldelloggedin)
                            .addComponent(txtloggedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addComponent(btndelviewqueue)
                        .addGap(35, 35, 35)
                        .addComponent(btndelorders)
                        .addGap(42, 42, 42)
                        .addComponent(btndelcuroders))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndelviewqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelviewqueueActionPerformed
        // TODO add your handling code here:
        {  
        ViewQueue viewqueue = new ViewQueue();
    panelBackWorkArea.removeAll();
    panelBackWorkArea.add("ViewQueue", viewqueue);
    ((java.awt.CardLayout) panelBackWorkArea.getLayout()).next(panelBackWorkArea);
                            
    }                                               
    }//GEN-LAST:event_btndelviewqueueActionPerformed

    private void btndelcurodersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelcurodersActionPerformed
        // TODO add your handling code here:
        {
        Currentorder curorder = new Currentorder(panelBackWorkArea);
        panelBackWorkArea.removeAll();
        panelBackWorkArea.add("Currentorder",curorder);
        ((java.awt.CardLayout) panelBackWorkArea.getLayout()).next(panelBackWorkArea);
   
    }
    }//GEN-LAST:event_btndelcurodersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelcuroders;
    private javax.swing.JButton btndelorders;
    private javax.swing.JButton btndelviewqueue;
    private javax.swing.JLabel lbldelloggedin;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblpic;
    private javax.swing.JLabel titledeliverylbl;
    private javax.swing.JTextField txtloggedin;
    // End of variables declaration//GEN-END:variables
}
