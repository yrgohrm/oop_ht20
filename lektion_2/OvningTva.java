public class OvningTva {
    public static void main(String[] args) {
        float radius = 1.3f;
 
        float FPI = (float)StrictMath.PI;

        float circumference = radius * 2 * FPI;
        float area = radius * radius * FPI;

        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
    }
}