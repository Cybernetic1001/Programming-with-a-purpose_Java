public class CMYKtoRGB {
    public static void main(String[] args) {
        //take in CMYK format as string to double from command line
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        //convert to rgb
        double white = (1 - black);
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        int r = (int) red;
        int g = (int) green;
        int b = (int) blue;

        //print to console
        System.out.println("Red = " + r);
        System.out.println("Green = " + g);
        System.out.println("Blue = " + b);

    }
}
