public class NoNegative {
    // n! = n*...3*2*1 
    /**
     * 
     * 
     * @throws IllegalArgumentException if the input is negative
     * 
     */
    private static int fac(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("input must be positive: " + n);
        }

        if (n == 1) {
            return 1;
        }
        else {
            return n * fac(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(-2));
    }
}
