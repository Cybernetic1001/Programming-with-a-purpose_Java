public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (Integer.bitCount(i ^ j) % 2 == 0) ? '+' : '-';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " " + " ");
            }
            System.out.println();
        }
    }
}
