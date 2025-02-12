import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queen {
    public static List<List<String>> NQ(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] brd = new char[n][n];

        // Initialize board with '*'
        for (char[] r : brd) {
            Arrays.fill(r, '*');
        }

        // Start solving from row 0
        solve(brd, 0, res);
        return res;
    }

    private static void solve(char[][] brd, int r, List<List<String>> res) {
        if (r == brd.length) {
            res.add(cd(brd));
            return;
        }

        for (int col = 0; col < brd.length; col++) {
            if (issafe(brd, r, col)) {
                brd[r][col] = 'Q'; // Place queen
                solve(brd, r + 1, res); // Recur for next row
                brd[r][col] = '*'; // Backtrack
            }
        }
    }

    private static List<String> cd(char[][] brd) {
        List<String> res = new ArrayList<>();
        for (char[] r : brd) {
            res.add(new String(r));
        }
        return res;
    }

    private static boolean issafe(char[][] brd, int r, int col) {
        int n = brd.length;

        // Check vertical column
        for (int i = 0; i < r; i++) {
            if (brd[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal (\)
        for (int i = r, j = col; i >= 0 && j >= 0; i--, j--) {
            if (brd[i][j] == 'Q') return false;
        }

        // Check right diagonal (/)
        for (int i = r, j = col; i >= 0 && j < n; i--, j++) {
            if (brd[i][j] == 'Q') return false;
        }

        return true;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        int n = 4; // Change n to test for different sizes
        List<List<String>> solutions = NQ(n);

        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
