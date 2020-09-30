public class Car {
    private static int maxFuel = 100;

    private int fuel;

    public Car() {
        fuel = 10;
    }

    public static int getMaxFuel() {
        return maxFuel;
    }

    public static void setMaxFuel(int maxFuel) {
        Car.maxFuel = maxFuel;
    }

    public int volumeToFillUp() {
        return maxFuel - fuel;
    }
}
