package practice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Encryption {

    private String password;
//    private String salt1="abcdefghijklm",salt2="nopqrstuvwxyz";

    Encryption(String password) {
        this.password = password;
        
    }
//    void addSalt()
//    {
//        password.insert(0,salt1);
//        password.append(salt2);
//        password.reverse();
//    }

    String hashed(String password) {
        
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    String encrypt() throws NoSuchAlgorithmException {
        return hashed(password);
    }

    

    public static void main(String[] args) {
        
        String s;
        try {
            s = new Encryption("10772112").encrypt();
            System.out.println(s);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
