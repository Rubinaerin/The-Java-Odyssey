import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        
        // n: Number of entries in the phone book
        int n = in.nextInt();
        in.nextLine(); // Clear the newline character
        
        // Using HashMap for fast lookup (O(1) complexity)
        Map<String, Integer> phoneBook = new HashMap<>();

        // Reading entries
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // Clear the newline character after reading phone
            phoneBook.put(name, phone);
        }

        // Reading queries until End of File (EOF)
        while(in.hasNext()) {
            String s = in.nextLine();
            // Check if name exists as a key in HashMap
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
