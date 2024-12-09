package practice;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Encryption {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    
    private static final String PUBLIC_KEY_STRING = 
        "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCG+hkvhXCuCN8x6ppqva8XdEVzUEj217kMSCebV+kpl9xbzNjrFNvIPDECa3o9pkyY8zGHsP4ivfpkQVuP/nhUv8gDMEWudwtqScyPHAMCqgwKnAAE8tC7arXHyLOfgTiWhMONOrvzSfWwCsytuhpIM8zWua4+eO/Ug81hbQpsUwIDAQAB";
    private static final String PRIVATE_KEY_STRING = 
        "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIb6GS+FcK4I3zHqmmq9rxd0RXNQSPbXuQxIJ5tX6SmX3FvM2OsU28g8MQJrej2mTJjzMYew/iK9+mRBW4/+eFS/yAMwRa53C2pJzI8cAwKqDAqcAATy0LtqtcfIs5+BOJaEw406u/NJ9bAKzK26GkgzzNa5rj5479SDzWFtCmxTAgMBAAECgYABLAC1+emdiTQu4cOPc7AmevrzYloP0pWntqSpY50BoHDoVyH3AIpb9bHTPI2mJWB633mpnO7H7HBVGIAsAuCWkIr/j2Dkf7wtcHYwh37fziRcdM6EsmMZJe6VrTeOJ0A6LHNZ4Y4NCiLnqwyl7gUxR7BfvGc2g2R7Ll9Xyl9mOQJBAMiFcH5WROiQ5Aq/DPFWXme0oA07C6l5RFZEEMV3eZDlfRumD3bfw0uTWe1bmmMoWst1dOia8un6Z6U/oIgOaQcCQQCsUkYKXT77gL6lzLmlxM0xnq7ealCcquhxsjp56ExEvKM6icVX6WrZEP2Aut7ZXVI9wV7EgDYj4dIqWmPj/8tVAkBhvCB7g4LstApiboJZcxZqh7BnIntprBCx11UxWi1ngWN8QXFSKHhg8r4nIbnbUMUIXASSh0uU3Zb9BUkyZ4urAkAanf65nRucZ4+LNqs6YsK7NmKWcl+PQ4rx/PCxYeNd/rFL2noEEUbyzoAJwVOoyZRpe5Py0EcMldYLuriRQDKdAkEAiQkPOg23mEVBsURQpaxKhG2Ce9GLfQNsPD1cBiArhnEO3Wq6AwIltors/kHm6qGvTBOE1V4ESUkDBBg4LNyhMg==";

    public void initFromStrings() {
        try {
            X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(decode(PUBLIC_KEY_STRING));
            PKCS8EncodedKeySpec keySpecPrivate = new PKCS8EncodedKeySpec(decode(PRIVATE_KEY_STRING));

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            publicKey = keyFactory.generatePublic(keySpecPublic);
            privateKey = keyFactory.generatePrivate(keySpecPrivate);

        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return encode(encryptedBytes);
    }

    public String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(decode(encryptedData));
        return new String(decryptedBytes);
    }

    public String hash(String data, String algorithm)throws NoSuchAlgorithmException{
        MessageDigest digest= MessageDigest.getInstance(algorithm);
        byte[] hashBytes=digest.digest(data.getBytes());
        return encode(hashBytes);
        
    }
    private static String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    private static byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }

    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        encryption.initFromStrings();

        String password = "12345678";
        try {
            String encryptedPassword = encryption.encrypt(password);
            String decryptedPassword = encryption.decrypt(encryptedPassword);

            System.out.println("Encrypted: " + encryptedPassword);
            System.out.println("Decrypted: " + decryptedPassword);
            
            String sha256Hash= encryption.hash(password, "SHA-256");
            System.out.println("SHA-256 Hash: "+sha256Hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

