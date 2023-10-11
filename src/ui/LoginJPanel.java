/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import model.UserList;


public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    private JPanel DisplayScreen;
    private UserList userlist;
    private User user;
    
    // create a constructor with argument of User
    // in this case User class is taken as a datatype 
    // the only type of argument that can be entered is an instance of a User class
    // if any other type of argument is entered, it will show an error
    
    public LoginJPanel(User user) {
        initComponents();
        this.user = user;
    }
    // Create another constructor with two arguments one of JPanel datatype and one of User class instance Datatype
    // if this LoginJPanel is instantiated elsewhere with these two arguments automatically this constructor will be considered and not the other one 
    
    LoginJPanel(JPanel JPanelDataType, User user) {
         initComponents();
          this.DisplayScreen=DisplayScreen;
          this.user=user;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        neuidlogintxt = new javax.swing.JTextField();
        passwordlogintext = new javax.swing.JTextField();
        LoginSubmitBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("NEU ID");

        jLabel3.setText("PASSWORD");

        passwordlogintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordlogintextActionPerformed(evt);
            }
        });

        LoginSubmitBtn.setBackground(new java.awt.Color(255, 0, 51));
        LoginSubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginSubmitBtn.setText("Login");
        LoginSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginSubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(neuidlogintxt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(passwordlogintext))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginSubmitBtn)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(neuidlogintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordlogintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(LoginSubmitBtn)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordlogintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordlogintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordlogintextActionPerformed

    private void LoginSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginSubmitBtnActionPerformed
        ViewAccountJPanel panel=new ViewAccountJPanel(DisplayScreen,user);
             DisplayScreen.add("ViewAccountJPanel",panel);
             CardLayout layout=(CardLayout)DisplayScreen.getLayout();
              layout.next(DisplayScreen);
    }//GEN-LAST:event_LoginSubmitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginSubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField neuidlogintxt;
    private javax.swing.JTextField passwordlogintext;
    // End of variables declaration//GEN-END:variables
}
