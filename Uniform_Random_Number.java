public class Uniform_Random_Number {
    public static void main(String[] args) {

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double sum = a + b + c + d + e;
        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);
        double min3 = Math.min(min1, min2);
        double min4 = Math.min(min3, e);

        double max = Math.max(a, b);
        double max1 = Math.max(c, d);
        double max2 = Math.max(max, max1);
        double max3 = Math.max(max2, e);


        System.out.println("Five Pseudorandom numbers between 0 and 1: " + a + "," + b + "," + c + "," + d + "," + e + "\n");
        System.out.println("The average is: " + (sum) / 5);
        System.out.println("The minimum is: " + min4);
        System.out.println("The maximum is: " + max3);
    }
}
