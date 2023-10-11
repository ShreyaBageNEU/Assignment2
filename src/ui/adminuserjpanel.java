/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.User;
import model.UserList;

public class adminuserjpanel extends javax.swing.JPanel {
    //Initialization
    private JPanel DisplayScreen;
    private UserList userlist;

    
    public adminuserjpanel(JPanel JPanelDataType , UserList userlist) {
        // Instantiation
        // 'this' refers to the instance in that particular class
        initComponents();
        this.DisplayScreen = DisplayScreen;
        this.userlist=userlist;
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccountBtn = new javax.swing.JButton();
        ManageAccountBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 51));
        setForeground(new java.awt.Color(255, 51, 51));

        CreateAccountBtn.setBackground(new java.awt.Color(255, 204, 204));
        CreateAccountBtn.setText("Create Account");
        CreateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBtnActionPerformed(evt);
            }
        });

        ManageAccountBtn.setBackground(new java.awt.Color(255, 204, 204));
        ManageAccountBtn.setText("Manage Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(CreateAccountBtn)
                .addGap(32, 32, 32)
                .addComponent(ManageAccountBtn)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountBtn;
    private javax.swing.JButton ManageAccountBtn;
    // End of variables declaration//GEN-END:variables
}
