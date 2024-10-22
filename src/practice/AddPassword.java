/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author IT
 */
public class AddPassword extends javax.swing.JFrame {

    /**
     * Creates new form AddPassword
     */
    private User user;
    private ImageIcon icon;
    public AddPassword(User user) {
        setResizable(false);
        this.user=user;
        setIcon();
        setLocations();
        setTitle("Add password");
        initComponents();
    }
    public void setIcon(){
        icon=new ImageIcon(getClass().getResource("/practiceIcons/addPassword.png"));
        this.setIconImage(icon.getImage());
    }
    public void setLocations()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - 379)/2 ;
        int y = (screenSize.height - 240)/2;
        setLocation(x, y);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        websiteName = new javax.swing.JTextField();
        addPass = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        websiteName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        websiteName.setForeground(new java.awt.Color(153, 153, 153));
        websiteName.setText("Website name");
        websiteName.setToolTipText("");
        websiteName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        websiteName.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        websiteName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                websiteNameMouseClicked(evt);
            }
        });

        addPass.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        addPass.setText("Add");
        addPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("123456789");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(addPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(websiteName, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(password))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(websiteName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void websiteNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_websiteNameMouseClicked
        JLabel website = new JLabel("Website name");
        website.setBounds(35, 14, 180, 25);
        website.setOpaque(false);
        website.setBackground(new Color(0, 0, 0, 0));
        website.setFont(new java.awt.Font("Segoe UI", 1, 18));
        website.setForeground(new java.awt.Color(153, 153, 153));
        if (websiteName.getText().equals("Website name")) {
            websiteName.setText("");
            jPanel1.repaint();
        }
        jPanel1.add(website);

    }//GEN-LAST:event_websiteNameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        JLabel pass = new JLabel("Password");
        pass.setBounds(35, 98, 180, 25);
        pass.setOpaque(false);
        pass.setBackground(new Color(0, 0, 0, 0));
        pass.setFont(new java.awt.Font("Segoe UI", 1, 18));
        pass.setForeground(new java.awt.Color(153, 153, 153));
        if (password.getText().equals("123456789")) {
            jPanel1.repaint();
            password.setText("");
        }
        jPanel1.add(pass);
    }//GEN-LAST:event_passwordMouseClicked

    private void addPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassActionPerformed
        
        PasswordAndWeb data=new PasswordAndWeb(password.getText(),websiteName.getText());
        user.addPassToList(data);
        DatabaseConnection db=new DatabaseConnection(user);
        db.addPasswordToDb();
        this.dispose();
    }//GEN-LAST:event_addPassActionPerformed

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
            java.util.logging.Logger.getLogger(AddPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField websiteName;
    // End of variables declaration//GEN-END:variables
}
