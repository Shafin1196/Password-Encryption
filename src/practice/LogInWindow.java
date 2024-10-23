package practice;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author IT
 */
public class LogInWindow extends javax.swing.JFrame {

    /**
     * Creates new form LogInWindow
     */
    private ImageIcon icon;
    public LogInWindow() {
        setResizable(false);
        setIcon();
        initComponents();
        setTitle("Log in");
        setLocationRelativeTo(null);
//        getConnection();
    }
    public void setIcon(){
        icon=new ImageIcon(getClass().getResource("/practiceIcons/mainIcon.png"));
        this.setIconImage(icon.getImage());
    }
    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passwordmanager", "root", "rsr554433");
            //            JOptionPane.showMessageDialog(null, "not connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "not connected");
            return null;

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

        jSeparator1 = new javax.swing.JSeparator();
        button1 = new java.awt.Button();
        jToggleButton1 = new javax.swing.JToggleButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        logInBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        button1.setLabel("button1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userField.setForeground(new java.awt.Color(153, 153, 153));
        userField.setText("User name");
        userField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userField.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        userField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userFieldMouseClicked(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("123456789");
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });

        logInBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("I don't have any account!");

        btnCreate.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(153, 153, 255));
        btnCreate.setText("Create new!");
        btnCreate.setBorder(null);
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(userField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(passwordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(logInBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCreate))
                .addContainerGap(76, Short.MAX_VALUE))
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

    private void userFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFieldMouseClicked
        JLabel user = new JLabel("User Name");
        user.setBounds(80, 42, 120, 25);
        user.setOpaque(false);
        user.setBackground(new Color(0, 0, 0, 0));
        user.setFont(new java.awt.Font("Segoe UI", 1, 18));
        user.setForeground(new java.awt.Color(153, 153, 153));
        if (userField.getText().equals("User name")) {
            userField.setText("");
            jDesktopPane1.repaint();
        }
        jDesktopPane1.add(user);


    }//GEN-LAST:event_userFieldMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        JLabel pass = new JLabel("Password");
        pass.setBounds(80, 130, 120, 25);
        pass.setOpaque(false);
        pass.setBackground(new Color(0, 0, 0, 0));
        pass.setFont(new java.awt.Font("Segoe UI", 1, 18));
        pass.setForeground(new java.awt.Color(153, 153, 153));
        if (passwordField.getText().equals("123456789")) {
            jDesktopPane1.repaint();
            passwordField.setText("");
        }
        jDesktopPane1.add(pass);

    }//GEN-LAST:event_passwordFieldMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CreateNew create = new CreateNew();
        create.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnCreateActionPerformed
    //convert data base image
    public ImageIcon convertToImage(byte[] imageBytes) {
        try {
            // Convert byte array to ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            
            // Read the input stream as a BufferedImage
            BufferedImage bufferedImage = ImageIO.read(bais);
            
            // Create and return an ImageIcon from the BufferedImage
            return new ImageIcon(bufferedImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from userdetails where userName=?");
            ps.setString(1, userField.getText());
            ResultSet rs = ps.executeQuery();
//            System.out.println(rs.getString("fullName"));
            try {
                if (rs.next()) {
                    String dbPass = rs.getString("password");
                    if (dbPass.equals(passwordField.getText())) {
                        User user = new User(rs.getString("fullName"),rs.getString("userName"), rs.getString("email"), rs.getString("mobile"), rs.getString("password"));
                        DatabaseConnection db=new DatabaseConnection(user);
                        db.getPasswords();
                        if(rs.getBytes("img")!=null){
                        user.addDp(convertToImage(rs.getBytes("img")));
                        }
                        this.dispose();
                        AllPassword window = new AllPassword(user);
                        window.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Password  is incorrect!");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "User name  not found!");

                }

            } catch (SQLException ex) {
                Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_logInBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private java.awt.Button button1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
