public class Inlamning {
    public static void main(String[] args) {
        byte by = -128;
        short sh = -32000;
        int in = 10;
        float fl = 13.37f;
        double doub = 10.3523;

        double result1 = (((by + sh) + in) + fl) + doub;

        double result2 = doub + fl + in + sh + by;

        double result3 = by + sh + in + (double) fl + doub;

        System.out.format("%.4f\n", result1);
        System.out.format("%.4f\n", result2);
        System.out.format("%.4f\n", result3);
    }
}
