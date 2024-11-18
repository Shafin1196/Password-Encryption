package practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    private User user;

    DatabaseConnection(User user) {
        this.user = user;
    }

    DatabaseConnection() {

    }

//    public void createDataBase() {
//        Connection con = null;
//
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "rsr554433");
//            con.createStatement().executeUpdate("CREATE DATABASE IF NOT EXISTS passwordmanager");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally{
//            try{
//                if(con!=null)con.close();
//            }catch(SQLException ex) {
//            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
    public void createTable(){
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://mysql-11b6728a-passwordmanager1.h.aivencloud.com:25436/defaultdb", "avnadmin", "AVNS_r5R2f51t7_58ELGz1_8");
            con.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS userdetails (id INT AUTO_INCREMENT PRIMARY KEY,userName varchar(50),fullName varchar(50),email varchar(100),password varchar(100),mobile varchar(11),img blob )");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(con!=null)con.close();
            }catch (SQLException ex) {
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
                PasswordAndWeb data = new PasswordAndWeb(rs.getString("password"), rs.getString("website"));
                user.addPassToList(data);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addPasswordToDb() {
        Connection con = getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("insert into " + user.getUserHandel() + "(website,password) values(?,?)");
            ps.setString(1, user.getData().getWeb());
            ps.setString(2, user.getData().getPass());
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
                    ps = con.prepareStatement("create table " + user.getUserHandel() + "(id INT AUTO_INCREMENT PRIMARY KEY,website varchar(100),password varchar(100))");
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
//        Connection con = getConnection();
//        if (user.getDp() != null) {
//            try {
//                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=?,img=? where userName=?");
//                ps.setString(6, user.getUserHandel());
//                ps.setString(1, fullName.getText());
//                ps.setString(2, mobile.getText());
//                ps.setString(3, email.getText());
//                ps.setString(4, password.getText());
//                try {
//                    ps.setBytes(5, convertToByte(user.getDp()));
//                } catch (IOException ex) {
//                    Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                ps.executeUpdate();
//                ps.close();
//                con.close();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        else{
//            try {
//                PreparedStatement ps = con.prepareStatement("update userdetails set fullName=?,mobile=?,email=?,password=? where userName=?");
//                ps.setString(5, user.getUserHandel());
//                ps.setString(1, fullName.getText());
//                ps.setString(2, mobile.getText());
//                ps.setString(3, email.getText());
//                ps.setString(4, password.getText());
//                ps.executeUpdate();
//                ps.close();
//                con.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(UserWindow.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            
//        }
    }

}
