import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // n satir sayisini okuyoruz
        int n = sc.nextInt();
        // Her bir satiri saklamak icin bir ArrayList listesi olusturuyoruz
        java.util.List<java.util.ArrayList<Integer>> lines = new java.util.ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // Satirdaki eleman sayisi
            java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            lines.add(row);
        }

        // q sorgu sayisini okuyoruz
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // Satir numarasi
            int y = sc.nextInt(); // Sutun numarasi
            
            try {
                // ArrayList 0-tabanli oldugu icin indekslerden 1 cikariyoruz
                System.out.println(lines.get(x - 1).get(y - 1));
            } catch (Exception e) {
                // Eger belirtilen konumda eleman yoksa hata mesaji yazdiriyoruz
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
