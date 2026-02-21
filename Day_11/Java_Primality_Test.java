import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        // Kodu buraya, main metodunun icine yaziyoruz
        BigInteger bigInt = new BigInteger(n);
        
        if (bigInt.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
