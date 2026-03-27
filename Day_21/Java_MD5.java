import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String password = sc.next();
            try {
                // Initialize MessageDigest with MD5 algorithm
                MessageDigest md = MessageDigest.getInstance("MD5");
                
                // Update digest with password bytes
                md.update(password.getBytes());
                
                // Compute the hash
                byte[] digest = md.digest();
                
                // Convert bytes to hexadecimal string
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b));
                }
                
                // Print the final MD5 hash
                System.out.println(sb.toString());
                
            } catch (NoSuchAlgorithmException e) {
                // This exception occurs if MD5 is not supported by the environment
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
