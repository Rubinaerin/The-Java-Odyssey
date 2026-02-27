import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int negativeSubarrays = 0;

        // Her bir baslangic noktasi icin
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            // O noktadan baslayan tum bitis noktalarini tara
            for (int j = i; j < n; j++) {
                currentSum += a[j];
                // Eger o ana kadarki toplam negatifse sayaci artir
                if (currentSum < 0) {
                    negativeSubarrays++;
                }
            }
        }

        System.out.println(negativeSubarrays);
    }
}
