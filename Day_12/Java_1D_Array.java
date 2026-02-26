import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
// n eleman kapasiteli 'a' isminde bir dizi olusturuyoruz
        int[] a = new int[n];

        // Dizinin her bir hucresine siradaki tam sayiyi kaydediyoruz
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
