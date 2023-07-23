public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;


        for (int t = 1; t <= trials; t++) {
            int x = 0;
            int y = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double i = Math.random();
                if (i < 0.25) {
                    x = x + 1; // east
                    steps++;
                } else if (i < 0.5 && i >= 0.25) {
                    x = x - 1; //west
                    steps++;
                } else if (i < 0.75 && i >= 0.5) {
                    y = y + 1; // north
                    steps++;
                } else if (i >= 0.75) {
                    y = y - 1; //south
                    steps++;
                } else {
                    break;
                }


            }
        }
        double average = (double) steps / (double) trials;
        System.out.println("average number of steps = " + average);
    }


}
