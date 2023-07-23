

public class GeneralizedHarmonic {
    public static void main(String[] args) {
//  h(n,r) = 1/1^r + 1/2^r + ... + 1/n^r

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double h = 0.0;
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result = 1 / Math.pow(i, r);
            h += result;
        }
        System.out.println(h);
    }
}
