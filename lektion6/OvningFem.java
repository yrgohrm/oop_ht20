public class OvningFem {
    public static void main(String[] args) {
        System.out.println("Hejsan");
        int i = 0;
        int j = 1;
        Rectangle r = new Rectangle();
        {
            int k = 2;
            for (int f = 0; f < 2; ++f) {
                int g = 3;
                System.out.println(i + j + k + " " + r + " " + f + g);
            }
        }
        System.out.println(i + j + " " + r);
    }
}