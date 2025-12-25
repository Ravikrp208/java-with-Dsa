import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {

        // 1️⃣ If index goes out of array → WIN
        if (i >= game.length) {
            return true;
        }

        // 2️⃣ Invalid move (out of bounds or blocked cell)
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // 3️⃣ Mark current position as visited
        game[i] = 1;

        // 4️⃣ Try all possible moves
        return canWinFrom(i + leap, leap, game) ||  // jump forward
               canWinFrom(i + 1, leap, game) ||     // move forward
               canWinFrom(i - 1, leap, game);       // move backward
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

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
