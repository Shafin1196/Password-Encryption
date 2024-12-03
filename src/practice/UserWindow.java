/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practice;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author IT
 */
public class UserWindow extends javax.swing.JFrame {

    /**
     * Creates new form UserWindow
     */
    User user = new User();
    private ImageIcon icon;
    public UserWindow(User user) {
        setIcon();
        this.user = user;
        setTitle("Passwor Manager");
        setLocations();
        initComponents();
        initUserData();
    }
    public void setIcon(){
        icon=new ImageIcon(getClass().getResource("/practiceIcons/mainIcon.png"));
        this.setIconImage(icon.getImage());
    }
    public void setLocations()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - 683)/2 ;
        int y = (screenSize.height - 500)/2;
        setLocation(x, y);
        
    }
    public Connection getConnection() {
        Connection con = null;
        try {
                     con = DriverManager.getConnection("jdbc:mysql://mysql-11b6728a-passwordmanager1.h.aivencloud.com:25436/defaultdb", "avnadmin", "AVNS_r5R2f51t7_58ELGz1_8");
            //            JOptionPane.showMessageDialog(null, "not connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "not connected");
            return null;

        }

    }

    public ImageIcon resizeImage(String imagePath, byte[] pic) {
        ImageIcon myImage = null;
        if (imagePath != null) {
            myImage = new ImageIcon(imagePath);

        } else {
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(dp.getWidth(), dp.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        dp = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        userName = new javax.swing.JTextField();
        saveProfileBtn = new javax.swing.JButton();
        userNameDp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProfileMenu = new javax.swing.JMenu();
        profileMenuBtn = new javax.swing.JMenuItem();
        addPassMenu = new javax.swing.JMenuItem();
        seeAllPassMenu = new javax.swing.JMenuItem();
        logOutMenu = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        dp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practiceIcons/profile (1).png"))); // NOI18N
        dp.setOpaque(true);
        dp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dpMouseClicked(evt);
            }
        });

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

        userName.setEditable(false);
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

        saveProfileBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        saveProfileBtn.setText("Save Changes");
        saveProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProfileBtnActionPerformed(evt);
            }
        });

        userNameDp.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        userNameDp.setText("UserName");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameDp, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(fullName, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(mobile)
                    .addComponent(dp)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveProfileBtn))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameDp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ProfileMenu.setBackground(new java.awt.Color(153, 255, 204));
        ProfileMenu.setForeground(new java.awt.Color(0, 102, 102));
        ProfileMenu.setText("||||");
        ProfileMenu.setToolTipText("");
        ProfileMenu.setBorderPainted(false);
        ProfileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfileMenu.setFocusPainted(true);
        ProfileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileMenuActionPerformed(evt);
            }
        });

        profileMenuBtn.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        profileMenuBtn.setText("Profile");
        profileMenuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileMenuBtnActionPerformed(evt);
            }
        });
        ProfileMenu.add(profileMenuBtn);

        addPassMenu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        addPassMenu.setText("Add new Password");
        addPassMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPassMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassMenuActionPerformed(evt);
            }
        });
        ProfileMenu.add(addPassMenu);

        seeAllPassMenu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        seeAllPassMenu.setText("See all passwords");
        seeAllPassMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seeAllPassMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAllPassMenuActionPerformed(evt);
            }
        });
        ProfileMenu.add(seeAllPassMenu);

        logOutMenu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        logOutMenu.setText("Log out");
        logOutMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMenuActionPerformed(evt);
            }
        });
        ProfileMenu.add(logOutMenu);

        jMenuBar1.add(ProfileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initUserData() {
        fullName.setText(user.getName());
        userName.setText(user.getUserHandel());
        password.setText(user.getHandelPass());
        mobile.setText(user.getMobile());
        email.setText(user.getEmail());
        userNameDp.setText(user.getName());
        if (user.getDp() != null) {
            dp.setIcon(user.getDp());

        } 

    }
    
    public byte[] convertToByte(ImageIcon icon) throws IOException {
        // Convert ImageIcon to Image
        Image image = icon.getImage();

        // Convert Image to BufferedImage
        BufferedImage bufferedImage = new BufferedImage(
                image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on the buffered image
        bufferedImage.getGraphics().drawImage(image, 0, 0, null);

        // Convert BufferedImage to ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", baos);  // You can change "png" to other formats like "jpg"

        // Convert ByteArrayOutputStream to byte array
        return baos.toByteArray();
    }
    private void dpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dpMouseClicked
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            dp.setIcon(resizeImage(path, null));
            user.addDp(resizeImage(path, null));

        } else {
            System.out.println("No file selected");
        }
    }//GEN-LAST:event_dpMouseClicked

    private void fullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullNameMouseClicked
        JLabel fullName1 = new JLabel("Full name");
        fullName1.setBounds(20, 193, 120, 25);
        fullName1.setOpaque(false);
        fullName1.setBackground(new Color(0, 0, 0, 0));
        fullName1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        fullName1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.repaint();
        jPanel1.add(fullName1);
    }//GEN-LAST:event_fullNameMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        JLabel email1 = new JLabel("Email");
        email1.setBounds(20, 279, 120, 25);
        email1.setOpaque(false);
        email1.setBackground(new Color(0, 0, 0, 0));
        email1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        email1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.repaint();
        jPanel1.add(email1);
    }//GEN-LAST:event_emailMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void mobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseClicked
        JLabel mobile1 = new JLabel("Mobile");
        mobile1.setBounds(20, 361, 120, 25);
        mobile1.setOpaque(false);
        mobile1.setBackground(new Color(0, 0, 0, 0));
        mobile1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        mobile1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.repaint();
        jPanel1.add(mobile1);
    }//GEN-LAST:event_mobileMouseClicked

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        JLabel password1 = new JLabel("Password");
        password1.setBounds(366, 193, 120, 25);
        password1.setOpaque(false);
        password1.setBackground(new Color(0, 0, 0, 0));
        password1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        password1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.repaint();
        jPanel1.add(password1);
    }//GEN-LAST:event_passwordMouseClicked

    private void logOutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMenuActionPerformed
        this.dispose();
        LogInWindow log = new LogInWindow();
        log.setVisible(true);
    }//GEN-LAST:event_logOutMenuActionPerformed

    private void profileMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileMenuBtnActionPerformed
        
    }//GEN-LAST:event_profileMenuBtnActionPerformed

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        JLabel userName1 = new JLabel("User name");
        userName1.setBounds(366, 279, 120, 25);
        userName1.setOpaque(false);
        userName1.setBackground(new Color(0, 0, 0, 0));
        userName1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        userName1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.repaint();
        jPanel1.add(userName1);
    }//GEN-LAST:event_userNameMouseClicked

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void saveProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProfileBtnActionPerformed
        
        Connection con = getConnection();
        user.setName(fullName.getText());
        user.setEmail(email.getText());
        user.setMobile(mobile.getText());
        user.setPass(password.getText());
        
        if (user.getDp() != null) {
            try {
                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=?,img=? where userName=?");
                ps.setString(6, user.getUserHandel());
                ps.setString(1, fullName.getText());
                ps.setString(2, mobile.getText());
                ps.setString(3, email.getText());
                ps.setString(4, password.getText());
                
                try {
                    ps.setBytes(5, convertToByte(user.getDp()));
                } catch (IOException ex) {
                    Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                ps.executeUpdate();
                ps.close();
                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            try {
                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=? where userName=?");
                ps.setString(5, user.getUserHandel());
                ps.setString(1, fullName.getText());
                ps.setString(2, mobile.getText());
                ps.setString(3, email.getText());
                ps.setString(4, password.getText());
                ps.executeUpdate();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }
        UserWindow userWindow=new UserWindow(user);
        userWindow.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_saveProfileBtnActionPerformed

    private void addPassMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassMenuActionPerformed
        AddPassword addWindow=new AddPassword(user);
        addWindow.setVisible(true);
    }//GEN-LAST:event_addPassMenuActionPerformed

    private void seeAllPassMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAllPassMenuActionPerformed
        this.dispose();
        AllPassword seeWebAndPass=new AllPassword(user);
        seeWebAndPass.setVisible(true);
    }//GEN-LAST:event_seeAllPassMenuActionPerformed

    private void ProfileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileMenuActionPerformed

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
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ProfileMenu;
    private javax.swing.JMenuItem addPassMenu;
    private javax.swing.JLabel dp;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logOutMenu;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField password;
    private javax.swing.JMenuItem profileMenuBtn;
    private javax.swing.JButton saveProfileBtn;
    private javax.swing.JMenuItem seeAllPassMenu;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameDp;
    // End of variables declaration//GEN-END:variables
}
