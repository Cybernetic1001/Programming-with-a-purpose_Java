import java.util.Arrays;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // Number of random indices to choose
        int[] a = new int[args.length - 1]; // Array to store positive integers a1, a2, ..., an
        int n = 0; // Total sum of a1, a2, ..., an

        // Parse the positive integers and calculate the total sum
        for (int i = 1; i < args.length; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
            n += a[i - 1];
        }

        // Calculate the cumulative sums Si
        int[] cumulativeSums = new int[a.length];
        cumulativeSums[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            cumulativeSums[i] = cumulativeSums[i - 1] + a[i];
        }

        // Generate m random indices with probabilities proportional to ai
        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * n); // Generate a random integer r between 0 and n-1
            int index = Arrays.binarySearch(cumulativeSums, r); // Find the unique index i with Si-1 <= r < Si

            if (index >= 0) {
                // If the random integer is exactly equal to a cumulative sum, find the next highest index
                while (index < cumulativeSums.length - 1 && cumulativeSums[index + 1] == r) {
                    index++;
                }
            } else {
                // If the random integer is not found in the cumulative sums, find the insertion point
                index = -(index + 1);
            }

            System.out.print(index + 1); // Print the chosen index (adding 1 to convert from 0-indexed to 1-indexed)
            if (j < m - 1) {
                System.out.print(" "); // Print whitespace between indices
            }
        }

        System.out.println(); // Print a newline at the end
    }
}
