import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int lineCount = 1;
        
        while (scan.hasNext()) {
            String line = scan.nextLine();
            System.out.println(lineCount + " " + line);
            lineCount++;
        }
        
        scan.close();
    }
}
