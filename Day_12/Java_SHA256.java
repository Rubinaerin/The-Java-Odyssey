import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        try {
            // SHA-256 algoritmasini baslatiyoruz
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            // Metni byte dizisine cevirip ozetliyoruz
            byte[] hash = md.digest(s.getBytes("UTF-8"));
            
            // Byte dizisini onaltilik (hex) formatina donusturuyoruz
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
            
        } catch (Exception e) {
            // Algoritma bulunamazsa veya kodlama hatasi olursa
        }
    }
}
