public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + "," + y + ")");

        while (Math.abs(x) + Math.abs(y) < r) {
            double i = Math.random();
            if (i <= 0.25) {
                x++; // east
                System.out.println("(" + x + "," + y + ")");
                steps++;
            } else if (i < 0.5 && i > 0.25) {
                x--; //west
                System.out.println("(" + x + "," + y + ")");
                steps++;
            } else if (i < 0.75 && i > 0.5) {
                y++; // north
                System.out.println("(" + x + "," + y + ")");
                steps++;
            } else if (i > 0.75) {
                y--; //south
                System.out.println("(" + x + "," + y + ")");
                steps++;
            } else {
                break;
            }


        }

        System.out.println("steps =" +
                " " + steps);
    }

}

