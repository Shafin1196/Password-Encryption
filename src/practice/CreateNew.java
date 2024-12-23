/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practice;

import java.sql.Connection;
import java.awt.Color;
import javax.swing.JLabel;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author IT
 */
public class CreateNew extends javax.swing.JFrame {

    /**
     * Creates new form CreateNew
     */
    private ImageIcon icon;
    public CreateNew() {
        setIcon();
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Create new account");
    }
    public void setIcon(){
        icon=new ImageIcon(getClass().getResource("/practiceIcons/mainIcon.png"));
        this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        fullName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        logInBtn = new javax.swing.JButton();
        userName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fullName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        fullName.setForeground(new java.awt.Color(153, 153, 153));
        fullName.setText("Full name");
        fullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullNameMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Email");
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        mobile.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mobile.setForeground(new java.awt.Color(153, 153, 153));
        mobile.setText("Mobile");
        mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileMouseClicked(evt);
            }
        });
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("123456789");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        logInBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        userName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(153, 153, 153));
        userName.setText("User name");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(fullName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mobile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(submitBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(logInBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(userName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(fullName)
                        .addComponent(password)
                        .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void fullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullNameMouseClicked
        JLabel fullName1 = new JLabel("Full name");
        fullName1.setBounds(52, 5, 120, 25);
        fullName1.setOpaque(false);
        fullName1.setBackground(new Color(0, 0, 0, 0));
        fullName1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        fullName1.setForeground(new java.awt.Color(153, 153, 153));
        if (fullName.getText().equals("Full name")) {
            fullName.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(fullName1);
    }//GEN-LAST:event_fullNameMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        JLabel email1 = new JLabel("Email");
        email1.setBounds(52, 79, 120, 25);
        email1.setOpaque(false);
        email1.setBackground(new Color(0, 0, 0, 0));
        email1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        email1.setForeground(new java.awt.Color(153, 153, 153));
        if (email.getText().equals("Email")) {
            email.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(email1);
    }//GEN-LAST:event_emailMouseClicked

    private void mobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseClicked
        JLabel mobile1 = new JLabel("Mobile");
        mobile1.setBounds(52, 157, 120, 25);
        mobile1.setOpaque(false);
        mobile1.setBackground(new Color(0, 0, 0, 0));
        mobile1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        mobile1.setForeground(new java.awt.Color(153, 153, 153));
        if (mobile.getText().equals("Mobile")) {
            mobile.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(mobile1);
    }//GEN-LAST:event_mobileMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        JLabel password1 = new JLabel("Password");
        password1.setBounds(52, 237, 120, 25);
        password1.setOpaque(false);
        password1.setBackground(new Color(0, 0, 0, 0));
        password1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        password1.setForeground(new java.awt.Color(153, 153, 153));
        if (password.getText().equals("123456789")) {
            password.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(password1);
    }//GEN-LAST:event_passwordMouseClicked

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        LogInWindow logIn = new LogInWindow();
        logIn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_logInBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        if (checkFieldNull()) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        } else {
            User user=new User(fullName.getText(),userName.getText(),email.getText(),mobile.getText(),password.getText());
            DatabaseConnection dp=new DatabaseConnection(user);
            if(dp.addNewUserToDb()){
            this.dispose();
            LogInWindow log = new LogInWindow();
            log.setVisible(true);
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed
public boolean checkFieldNull()
{
    if (userName.getText() == null || fullName.getText() == null || password.getText() == null || mobile.getText() == null || email.getText() == null
                || userName.getText().equals("User name") || fullName.getText().equals("Full name") || password.getText().equals("123456789")
                || mobile.getText().equals("Mobile") || email.getText().equals("Email")) {
            return true;
        }
    return false;
}
    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        JLabel userName1 = new JLabel("User name");
        userName1.setBounds(52, 320, 120, 25);
        userName1.setOpaque(false);
        userName1.setBackground(new Color(0, 0, 0, 0));
        userName1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        userName1.setForeground(new java.awt.Color(153, 153, 153));
        if (userName.getText().equals("User name")) {
            userName.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(userName1);
    }//GEN-LAST:event_userNameMouseClicked

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreateNew().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton logInBtn;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
