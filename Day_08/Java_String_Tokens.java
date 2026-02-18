import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim(); // Remove leading and trailing spaces
        
        // Handle empty string edge case
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split by non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Print the number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}

