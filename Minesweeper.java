public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]); // Number of rows
        int n = Integer.parseInt(args[1]); // Number of columns
        int k = Integer.parseInt(args[2]); // Number of mines


        // if (k >= m * n) {
        //System.out.println("Error: Number of mines must be less than the total number of cells.");
        //return;
        //}

        char[][] grid = new char[m][n];

        // Initialize grid with empty cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        // Place mines randomly
        int minesPlaced = 0;
        while (minesPlaced < k) {
            int row = (int) (Math.random() * m); // Generate a random row index
            int col = (int) (Math.random() * n); // Generate a random column index
            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                minesPlaced++;
            }
        }

        // Fill in neighboring mine counts
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '.') {
                    int count = 0;
                    for (int dr = -1; dr <= 1; dr++) {
                        for (int dc = -1; dc <= 1; dc++) {
                            int newRow = i + dr;
                            int newCol = j + dc;
                            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == '*') {
                                count++;
                            }
                        }
                    }
                    grid[i][j] = (char) ('0' + count);
                }
            }
        }

        // Print the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
