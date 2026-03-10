import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                if (sc.hasNextInt()) {
                    int y = sc.nextInt();
                    System.out.println(x / y);
                } else {
                    throw new InputMismatchException();
                }
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
