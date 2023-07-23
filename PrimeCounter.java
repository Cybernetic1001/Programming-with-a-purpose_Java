public class PrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = 2;
        System.out.println("2"); // because two is prime so print as first number
        while (k < n) {
            boolean isPrime = true; // create a variable that keeps track if k is prime or not

            if (k % 2 == 0) {
                isPrime = false;
            } else {
                for (int i = 3; i <= Math.sqrt(k); i += 2) {
                    if (k % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(k);
            }
            k++;

        }
    }
}
