/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DeliveryManWorkArea;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author SRADDHA
 */
public class RestaurantDetails extends javax.swing.JPanel {
     javax.swing.JPanel panelBackWorkArea;
    /**
     * Creates new form RestaurantDetails
     */
     public RestaurantDetails(javax.swing.JPanel panelBackWorkArea) {
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

        lbldelresdetails = new javax.swing.JLabel();
        lbldelresid = new javax.swing.JLabel();
        lbldelresname = new javax.swing.JLabel();
        lbldelresmanager = new javax.swing.JLabel();
        lbldelresphone = new javax.swing.JLabel();
        lbldelresaddress = new javax.swing.JLabel();
        txtdelresid = new javax.swing.JTextField();
        txtdelresname = new javax.swing.JTextField();
        txtdelresmanager = new javax.swing.JTextField();
        txtdelresphone = new javax.swing.JTextField();
        txtdelresaddress = new javax.swing.JTextField();
        lbldelbackbtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lbldelresdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldelresdetails.setForeground(new java.awt.Color(51, 51, 51));
        lbldelresdetails.setText("RESTAURANT DETAILS");

        lbldelresid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelresid.setText("Restaurant ID:");

        lbldelresname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelresname.setText("Restaurant Name:");

        lbldelresmanager.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelresmanager.setText("Restaurant Manager:");

        lbldelresphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelresphone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldelresphone.setText("Phone number:");

        lbldelresaddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelresaddress.setText("Address:");

        txtdelresmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelresmanagerActionPerformed(evt);
            }
        });

        lbldelbackbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldelbackbtn.setForeground(new java.awt.Color(255, 51, 51));
        lbldelbackbtn.setText(">>Back");
        lbldelbackbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbldelbackbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldelbackbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldelbackbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldelbackbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbldelbackbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(lbldelresdetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldelresphone)
                            .addComponent(lbldelresmanager)
                            .addComponent(lbldelresname)
                            .addComponent(lbldelresid)
                            .addComponent(lbldelresaddress))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdelresid, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtdelresname)
                            .addComponent(txtdelresmanager)
                            .addComponent(txtdelresphone)
                            .addComponent(txtdelresaddress))))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldelresdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldelbackbtn))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldelresid)
                    .addComponent(txtdelresid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdelresname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldelresname, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdelresmanager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldelresmanager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdelresphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldelresphone, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldelresaddress)
                    .addComponent(txtdelresaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(742, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbldelbackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldelbackbtnMouseClicked
        // TODO add your handling code here:
        panelBackWorkArea.remove(this);
        ((java.awt.CardLayout) panelBackWorkArea.getLayout()).next(panelBackWorkArea);
    }//GEN-LAST:event_lbldelbackbtnMouseClicked

    private void lbldelbackbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldelbackbtnMouseEntered
        // TODO add your handling code here:
        lbldelbackbtn.setForeground(Color.blue);
    }//GEN-LAST:event_lbldelbackbtnMouseEntered

    private void lbldelbackbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldelbackbtnMouseExited
        lbldelbackbtn.setForeground(Color.red); // TODO add your handling code here:
    }//GEN-LAST:event_lbldelbackbtnMouseExited

    private void txtdelresmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelresmanagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdelresmanagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbldelbackbtn;
    private javax.swing.JLabel lbldelresaddress;
    private javax.swing.JLabel lbldelresdetails;
    private javax.swing.JLabel lbldelresid;
    private javax.swing.JLabel lbldelresmanager;
    private javax.swing.JLabel lbldelresname;
    private javax.swing.JLabel lbldelresphone;
    private javax.swing.JTextField txtdelresaddress;
    private javax.swing.JTextField txtdelresid;
    private javax.swing.JTextField txtdelresmanager;
    private javax.swing.JTextField txtdelresname;
    private javax.swing.JTextField txtdelresphone;
    // End of variables declaration//GEN-END:variables

    
}