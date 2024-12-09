package practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    private User user;

    DatabaseConnection(User user) {
        this.user = user;
    }

    DatabaseConnection() {

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

    public void createTable() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://mysql-11b6728a-passwordmanager1.h.aivencloud.com:25436/defaultdb", "avnadmin", "AVNS_r5R2f51t7_58ELGz1_8");
            con.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS userdetails (id INT AUTO_INCREMENT PRIMARY KEY,userName varchar(50),fullName varchar(50),email varchar(100),password varchar(100),mobile varchar(11),img blob )");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://mysql-11b6728a-passwordmanager1.h.aivencloud.com:25436/defaultdb", "avnadmin", "AVNS_r5R2f51t7_58ELGz1_8");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void getPasswords() {
        Connection con = getConnection();
        PreparedStatement ps;

        try {

            ps = con.prepareStatement("select * from " + user.getUserHandel());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PasswordAndWeb data = new PasswordAndWeb(rs.getString("password"), rs.getString("website"),rs.getString("userHandel"));
                user.addPassToList(data);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addPasswordToDb() {
        Connection con = getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("insert into " + user.getUserHandel() + "(website,password,userHandel) values(?,?,?)");
            ps.setString(1, user.getData().getWeb());
            ps.setString(2, user.getData().getPass());
            ps.setString(3, user.getData().getHandel());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createUserDetailsTable() {

    }

    public boolean addNewUserToDb() {
        try {

            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement("select userName from userdetails where userName= ?");

            ps.setString(1, user.getUserHandel());

            ResultSet rs = ps.executeQuery();
            try {
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, user.getUserHandel() + " is already used try another!");
                    return false;
                } else {
                    ps = con.prepareStatement("insert into userdetails(userName,fullName,password,email,mobile)" + "values(?,?,?,?,?)");
                    ps.setString(1, user.getUserHandel());
                    ps.setString(2, user.getName());
                    ps.setString(3, user.getHandelPass());
                    ps.setString(4, user.getEmail());
                    ps.setString(5, user.getMobile());
                    ps.executeUpdate();
                    ps = con.prepareStatement("create table " + user.getUserHandel() + "(id INT AUTO_INCREMENT PRIMARY KEY,website varchar(100),password varchar(1000),userHandel varchar(100))");
                    ps.executeUpdate();
                    ps.close();
                    con.close();
                    return true;
                }

            } catch (SQLException ex) {
                // Log the exception to see what went wrong
                return false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateNew.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public void updateUserData() {
        Connection con = getConnection();
        if (user.getDp() != null) {
            try {
                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=?,img=? where userName=?");
                ps.setString(6, user.getUserHandel());
                ps.setString(1, user.getName());
                ps.setString(2, user.getMobile());
                ps.setString(3, user.getEmail());
                ps.setString(4, user.getPass());
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

        } else {
            try {
                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=? where userName=?");
                ps.setString(5, user.getUserHandel());
                ps.setString(1, user.getName());
                ps.setString(2, user.getMobile());
                ps.setString(3, user.getEmail());
                ps.setString(4, user.getPass());
                ps.executeUpdate();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
    public User authenticate(String userName,String pass)
    {
         try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from userdetails where userName=?");
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
//            System.out.println(rs.getString("fullName"));
            try {
                if (rs.next()) {
                    String dbPass = rs.getString("password");
                    Encryption en=new Encryption();
                    try {
                        pass=en.hash(pass);
                    } catch (Exception ex) {
                        Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (dbPass.equals(pass)) {
                        User user = new User(rs.getString("fullName"),rs.getString("userName"), rs.getString("email"), rs.getString("mobile"), rs.getString("password"));
                        DatabaseConnection db=new DatabaseConnection(user);
                        db.getPasswords();
                        if(rs.getBytes("img")!=null){
                        user.addDp(convertToImage(rs.getBytes("img")));
                        }
                        return user;
                    } else {
                        JOptionPane.showMessageDialog(null, "Password  is incorrect!");
                        return null;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "User name  not found!");
                    return null;

                }

            } catch (SQLException ex) {
                Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
