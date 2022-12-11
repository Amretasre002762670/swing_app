/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DeliveryManWorkArea;

import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author amretasrerengarajan
 */
public class ChangeStatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChangeStatusPanel
     */
    
    JPanel panelBackWorkArea;
    WorkRequest currentOrderQueue;
    WorkQueue workQueue;
    public ChangeStatusPanel(JPanel panelBackWorkArea, WorkRequest currentOrderQueue, WorkQueue workQueue) {
        initComponents();

        this.panelBackWorkArea = panelBackWorkArea;
        this.currentOrderQueue = currentOrderQueue;
        this.workQueue = workQueue;

        txtOrderStatus.setEditable(false);
        txtOrderStatus.setText(currentOrderQueue.getMessage());

        lblWarning.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        txtOrderStatus = new javax.swing.JTextField();
        btnOrderPickedUp = new javax.swing.JButton();
        btnOrderDelivered = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Change Status Of Current Order");

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("<< Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        lblOrderStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblOrderStatus.setText("Current Order Status:");

        btnOrderPickedUp.setBackground(new java.awt.Color(204, 255, 204));
        btnOrderPickedUp.setText("Order Picked Up");
        btnOrderPickedUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderPickedUpActionPerformed(evt);
            }
        });

        btnOrderDelivered.setBackground(new java.awt.Color(204, 255, 204));
        btnOrderDelivered.setText("Delivered Order");
        btnOrderDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDeliveredActionPerformed(evt);
            }
        });

        lblWarning.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarning.setText("Invalid Event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblOrderStatus)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOrderPickedUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOrderDelivered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderStatus)
                    .addComponent(txtOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnOrderPickedUp)
                .addGap(38, 38, 38)
                .addComponent(btnOrderDelivered)
                .addGap(46, 46, 46)
                .addComponent(lblWarning)
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderPickedUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderPickedUpActionPerformed
        // TODO add your handling code here:
        if (currentOrderQueue.getMessage().equals("Ready For Pickup")) {
            currentOrderQueue.setMessage("Order Picked Up");
            txtOrderStatus.setText(currentOrderQueue.getMessage());
            lblWarning.setVisible(false);
        } else {
            lblWarning.setVisible(true);
        }
    }//GEN-LAST:event_btnOrderPickedUpActionPerformed

    private void btnOrderDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDeliveredActionPerformed
        // TODO add your handling code here:
        if (currentOrderQueue.getMessage().equals("Order Picked Up")) {
            currentOrderQueue.setMessage("Delivered");
            txtOrderStatus.setText(currentOrderQueue.getMessage());
            currentOrderQueue.setStatus("negative");
            lblWarning.setVisible(false);
            workQueue.removeWorkRequest(currentOrderQueue);
        } else {
            lblWarning.setVisible(true);
        }
    }//GEN-LAST:event_btnOrderDeliveredActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        panelBackWorkArea.remove(this);
        ((java.awt.CardLayout) panelBackWorkArea.getLayout()).show(panelBackWorkArea, "Currentorder");
    }//GEN-LAST:event_btnBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnOrderDelivered;
    private javax.swing.JButton btnOrderPickedUp;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtOrderStatus;
    // End of variables declaration//GEN-END:variables
}
