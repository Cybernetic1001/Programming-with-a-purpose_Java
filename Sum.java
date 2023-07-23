public class Sum {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
