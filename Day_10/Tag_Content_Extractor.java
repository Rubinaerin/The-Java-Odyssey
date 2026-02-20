import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	boolean found = false;
          // HTML etiketlerini ve icerigini yakalayan Regex deseni
          String regex = "<(.+)>([^<]+)</\\1>";
          java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
          java.util.regex.Matcher m = p.matcher(line);

          while (m.find()) {
              System.out.println(m.group(2)); // Sadece icerigi (2. grup) yazdirir
              found = true;
          }
          if (!found) {
              System.out.println("None");
          }
			
			testCases--;
		}
	}
}



