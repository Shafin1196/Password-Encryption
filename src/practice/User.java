package practice;

import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    private String name, password, mobile, userName, email;
    private ImageIcon dp;
    private ArrayList<PasswordAndWeb> passwordList = new ArrayList<>();
    public Encryption en = new Encryption();

    User() {

    }

    User(String name, String userName, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        try {
            this.password = en.hash(password);
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.userName = userName;

    }

    public String status(String pass) {
        int sym = 0, digit = 0, cap = 0, small = 0;
        for (char c : pass.toCharArray()) {
            if (c >= 'a' && c <= 'z' && small == 0) {
                small++;
            } else if (c >= 'A' && c <= 'Z' && cap == 0) {
                cap++;
            } else if (c >= '0' && c <= '9' && digit == 0) {
                digit++;
            } else if (sym == 0) {
                sym++;
            }
        }
        int strength = sym + digit + cap + small;

        if (strength == 4) {
            return "Strong";
        } else if (strength == 3) {
            return "Medium";
        } else {
            return "Weak";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserHandel() {
        return userName;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandelPass() {
        return password;
    }

    public void addPassToList(PasswordAndWeb data) {
        passwordList.add(data);
    }

    public PasswordAndWeb getData() {
        return passwordList.get(passwordList.size() - 1);
    }

    public ArrayList<PasswordAndWeb> getList() {
        return passwordList;

    }

    public void addDp(ImageIcon dp) {
        this.dp = dp;
    }

    public ImageIcon getDp() {
        return dp;
    }

    public void deleteData(PasswordAndWeb delData) {
        for (PasswordAndWeb data : passwordList) {
            if (data == delData) {
                passwordList.remove(delData);
            }
        }
    }

    public static void main(String[] args) {
        User user = new User("sds", "dsada", "dasdsa", "dsad", "dsadsa");
        System.out.println(user.getPass());
    }

}
