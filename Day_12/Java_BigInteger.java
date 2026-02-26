import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);
        java.math.BigInteger a = new java.math.BigInteger(sc.next());
        java.math.BigInteger b = new java.math.BigInteger(sc.next());

        // Toplama islemi
        System.out.println(a.add(b));
        // Carpma islemi
        System.out.println(a.multiply(b));
    }
}
