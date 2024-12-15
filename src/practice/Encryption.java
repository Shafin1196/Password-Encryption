package practice;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;

public class Encryption {

    private static final String ALGORITHM = "AES";  // Encryption algorithm
    private static final String SECRET_KEY = "1234567890123456";  // 16-byte secret key (AES-128)

    /**
     * Encrypts the provided string using AES algorithm.
     *
     * @param data The string to be encrypted.
     * @return The encrypted string (Base64 encoded).
     * @throws Exception if encryption fails.
     */
    public String encrypt(String data) throws Exception {
        // Create a SecretKeySpec using the secret key
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        
        // Create a Cipher instance for AES encryption
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        // Encrypt the data and return the encrypted data as a Base64 encoded string
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    /**
     * Decrypts the encrypted data using AES algorithm.
     *
     * @param encryptedData The encrypted data (Base64 encoded).
     * @return The decrypted string.
     * @throws Exception if decryption fails.
     */
    public String decrypt(String encryptedData) throws Exception {
        // Create a SecretKeySpec using the secret key
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        
        // Create a Cipher instance for AES decryption
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        
        // Decrypt the data and return the decrypted data as a string
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedBytes = cipher.doFinal(decodedData);
        return new String(decryptedBytes);
    }

    /**
     * Hashes the provided data using SHA-256.
     *
     * @param data The string to be hashed.
     * @return The hashed string (Base64 encoded).
     * @throws Exception if hashing fails.
     */
    public String hash(String data) throws Exception {
        // Create a MessageDigest instance for SHA-256
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        
        // Hash the data and return the hashed data as a Base64 encoded string
        byte[] hashBytes = digest.digest(data.getBytes());
        return Base64.getEncoder().encodeToString(hashBytes);
    }

    public static void main(String[] args) {
        try {
            Encryption encryption = new Encryption();

            // Test data
            String data = "12345678";

            // Encrypt data
            String encryptedData = ("WH6EuTqFiII8I8/lcEvP2w==");
//            System.out.println("Encrypted: " + encryptedData);

            // Decrypt data
            String decryptedData = encryption.decrypt(encryptedData);
            System.out.println("Decrypted: " + decryptedData);

            // Hash data with SHA-256
            String hashedData = encryption.hash(data);
            System.out.println("SHA-256 Hash: " + hashedData);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
