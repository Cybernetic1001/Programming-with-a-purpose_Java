public class Factorial {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }
}
