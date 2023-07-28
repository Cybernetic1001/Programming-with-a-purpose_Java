public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] counts = new int[n + 1]; // To store the number of times i people enter the room

        for (int t = 0; t < trials; t++) {
            boolean[] birthdays = new boolean[n]; // To track birthdays of people in the room
            int peopleCount = 0; // To count the number of people entering the room

            while (true) {
                int birthday = (int) (Math.random() * n); // Choose a random birthday between 0 and n-1
                peopleCount++;

                // Check if the chosen birthday already exists in the room
                if (birthdays[birthday]) {
                    counts[peopleCount]++;
                    break;
                } else {
                    birthdays[birthday] = true;
                }
            }
        }

        // Calculate the fraction of times i or fewer people enter the room
        int sum = 0;
        int i = 1;

        while (i <= n && ((double) sum / trials) < 0.5) {
            sum += counts[i];
            double fraction = (double) sum / trials;
            System.out.printf("%d\t%d\t\t%.4f%n", i, counts[i], fraction);
            i++;
        }
    }
}
