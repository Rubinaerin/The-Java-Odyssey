import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Base case: Starting the recursion from index 0
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Condition 1: If we reached or passed the end of the array, we won
        if (i >= game.length) {
            return true;
        }
        // Condition 2: If the index is invalid (negative) or we hit an obstacle
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // Mark current cell as visited to prevent infinite loops
        game[i] = 1;

        // Try all three possible moves: Jump, Move Forward, Move Backward
        return isSolvable(leap, game, i + leap) || 
               isSolvable(leap, game, i + 1) || 
               isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
