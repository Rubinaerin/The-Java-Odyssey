import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading initial list size
        int N = sc.nextInt();
        LinkedList<Integer> L = new LinkedList<>();
        
        // Filling the list with initial elements
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        
        // Reading the number of queries
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = sc.next();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                L.add(index, value);
            } else if (action.equals("Delete")) {
                int index = sc.nextInt();
                L.remove(index);
            }
        }
        sc.close();
        
        // Printing the final list separated by spaces
        for (Integer num : L) {
            System.out.print(num + " ");
        }
    }
}
