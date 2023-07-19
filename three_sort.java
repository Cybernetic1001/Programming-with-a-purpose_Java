public class three_sort {
    public static void main(String[] args) {
        // Read three integers from the command line
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        //
        int min = Math.min(Math.min(x, y), z);
        int max = Math.max(Math.max(x, y), z);
        int middle = x + y + z - min - max;

        System.out.println("The numbers in ascending order: " + min + "," + middle + "," + max);
    }
}
