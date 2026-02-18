import java.util.Scanner;

public class Solution {

   static boolean isAnagram(String a, String b) {
        // Kelimeleri karsilastirmak icin kucuk harfe ceviriyoruz
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Uzunluklar farkliysa anagram olamazlar
        if (a.length() != b.length()) {
            return false;
        }
        
        // Karakterleri siralamak icin diziye donusturuyoruz
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        
        java.util.Arrays.sort(charArrayA);
        java.util.Arrays.sort(charArrayB);
        
        // Siralanmis diziler ayniysa anagramdir
        return java.util.Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
