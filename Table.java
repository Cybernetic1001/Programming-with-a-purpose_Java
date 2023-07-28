import java.util.Arrays;

public class Table {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[][] resultMatrix = new int[N][N]; //two-dimensional array
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                resultMatrix[k][i] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(resultMatrix[i]);
        }
    }
} // create nxn matrix initialized with all zeros
