import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
      // Define India Locale (Language: English, Country: India)
        Locale indiaLocale = new Locale("en", "IN");

        // Create currency formatters for each locale
        NumberFormat nUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nIn = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format the payment and define the variables
        String us = nUs.format(payment);
        String india = nIn.format(payment);
        String china = nCh.format(payment);
        String france = nFr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
