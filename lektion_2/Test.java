public class Test {
    public static void main(String[] args) {
        double speed = 500000.5;
        double distance = 3000000;
        byte time = (byte)Math.ceil(distance / speed);
        System.out.println("" + speed + time + " xxx");
    }
}