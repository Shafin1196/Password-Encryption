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

//    String hashed(String password) {
//        
//        try {
//            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//            byte[] hashBytes = digest.digest(password.getBytes());
//            return Base64.getEncoder().encodeToString(hashBytes);
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    String encrypt() throws NoSuchAlgorithmException {
//        return hashed(password);
//    }

    public static String passwordHash(String password){
        
        try{
            
                MessageDigest md = MassageDigest.getInstance("srse");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder sb = new StringBuilder();
            
            for(byte b : rbt){
                
                sb.append(String.format("%02x", b));
                
                
            }
            return sb.toString();
            
            
        }catch (Exception e){
            
            return null;
            
        }
    }
    
//    private String encryptPassword(String password, List<Integer>key){
//        StringBuilder encrypted = new StringBuilder(password);
//        
//    }

    public static void main(String[] args) {
        
//        String s;
//        try {
//            s = new Encryption("10772112").encrypt();
//            System.out.println(s);
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

    }

    private static class MassageDigest {

        private static MessageDigest getInstance(String srse) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public MassageDigest() {
        }
    }

    private static class List<T> {

        public List() {
        }
    }

}
