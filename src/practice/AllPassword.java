package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllPassword extends javax.swing.JFrame {

    /**
     * Creates new form AllPassword
     */
    JPanel panel;
    private User user;
    private ImageIcon icon;

    public AllPassword(User user) {
        setResizable(false);
        this.user = user;
        setIcon();
        setLocationRelativeTo(null);
        setLocations();
        initComponents();
        setTitle("All passwords");
        initData();
        setSize(675, 500);
    }

    public void setLocations() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - 675) / 2;
        int y = (screenSize.height - 500) / 2;
        setLocation(x, y);

    }

    public void setIcon() {
        icon = new ImageIcon(getClass().getResource("/practiceIcons/mainIcon.png"));
        this.setIconImage(icon.getImage());
    }

    public void refreshPanel() {
        JPanel panel = (JPanel) jScrollPane1.getViewport().getView(); // Get the current panel in JScrollPane
        panel.removeAll(); // Remove all existing components

        // Add updated components
        ArrayList<PasswordAndWeb> list = user.getList();
        int y = 10;
        for (PasswordAndWeb data : list) {
            JLabel website = new JLabel(data.getWeb());
            website.setBounds(15, y, 180, 25);
            panel.add(website);

            JLabel handel = new JLabel(data.getHandel());
            handel.setBounds(200, y, 180, 25);
            panel.add(handel);

            JLabel pass = new JLabel(data.getPass());
            pass.setBounds(390, y, 180, 25);
            panel.add(pass);

            JButton actionButton = new JButton("Decrypt");
            actionButton.setBounds(550, y, 75, 25);
            actionButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
            actionButton.setForeground(new java.awt.Color(0, 102, 204));
            actionButton.setFocusPainted(false);
            actionButton.addActionListener(e -> {
                if (actionButton.getText().equals("Decrypt")) {
                    actionButton.setText("Encrypt");
                } else {
                    actionButton.setText("Decrypt");
                }
            });
            panel.add(actionButton);

            y += 30;
        }

        // Update the panel size
        panel.setPreferredSize(new Dimension(660, y));

        // Refresh and repaint
        panel.revalidate(); // Recalculates layout
        panel.repaint();    // Repaints the panel
    }

    public void initData() {

        ArrayList<PasswordAndWeb> list = user.getList();
        panel = new JPanel();
        panel.setLayout(null); // Using absolute positioning
        panel.setBackground(Color.WHITE);
        int y = 10;
        for (PasswordAndWeb data : list) {
            JLabel website = new JLabel(data.getWeb());
            website.setBounds(15, y, 180, 25);

            website.setOpaque(false);
            website.setBackground(new Color(0, 0, 0, 0));
            website.setFont(new java.awt.Font("Segoe UI", 1, 12));
            website.setForeground(new java.awt.Color(153, 153, 153));

            JLabel handel = new JLabel(data.getHandel());
            handel.setOpaque(false);
            handel.setBounds(200, y, 180, 25);
            handel.setBackground(new Color(0, 0, 0, 0));
            handel.setFont(new java.awt.Font("Segoe UI", 1, 12));
            handel.setForeground(new java.awt.Color(153, 153, 153));

            JLabel pass = new JLabel(data.getPass());
            pass.setOpaque(false);
            pass.setBounds(390, y, 180, 25);
            pass.setBackground(new Color(0, 0, 0, 0));
            pass.setFont(new java.awt.Font("Segoe UI", 1, 12));
            pass.setForeground(new java.awt.Color(153, 153, 153));

            JButton actionButton = new JButton("Decrypt");
            actionButton.setBounds(550, y, 75, 25);
            actionButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
            actionButton.setForeground(new java.awt.Color(0, 102, 204));
            actionButton.setFocusPainted(false);
            // Add action listener to button
            actionButton.addActionListener(e -> {
                System.out.println("Action for: " + data.getWeb());
                System.out.println(actionButton.getText());
                if (actionButton.getText().equals("Decrypt")) {
                    actionButton.setText("Encrypt");
                } else {
                    actionButton.setText("Decrypt");

                }
                // Add the desired functionality here
            });

            panel.repaint();
            panel.add(website);
            panel.add(handel);
            panel.add(pass);
            panel.add(actionButton);
            y += 25;

        }
        panel.setPreferredSize(new Dimension(660, y));
        jScrollPane1.setViewportView(panel);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProfileMenu = new javax.swing.JMenu();
        profileMenuBtn = new javax.swing.JMenuItem();
        addPassMenu = new javax.swing.JMenuItem();
        seeAllPassMenu = new javax.swing.JMenuItem();
        logOutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Website");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("User Handel");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ProfileMenu.setBackground(new java.awt.Color(153, 255, 204));
        ProfileMenu.setForeground(new java.awt.Color(0, 102, 102));
        ProfileMenu.setText("||||");
        ProfileMenu.setToolTipText("");
        ProfileMenu.setBorderPainted(false);
        ProfileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfileMenu.setFocusPainted(true);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileMenuBtnActionPerformed
        this.dispose();
        UserWindow window = new UserWindow(user);
        window.setVisible(true);
    }//GEN-LAST:event_profileMenuBtnActionPerformed

    private void addPassMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassMenuActionPerformed
        AddPassword addWindow = new AddPassword(user, jScrollPane1);
        addWindow.setVisible(true);
//        initData();
    }//GEN-LAST:event_addPassMenuActionPerformed

    private void logOutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMenuActionPerformed
        this.dispose();
        LogInWindow log = new LogInWindow();
        log.setVisible(true);
    }//GEN-LAST:event_logOutMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllPassword(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ProfileMenu;
    private javax.swing.JMenuItem addPassMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logOutMenu;
    private javax.swing.JMenuItem profileMenuBtn;
    private javax.swing.JMenuItem seeAllPassMenu;
    // End of variables declaration//GEN-END:variables
}
