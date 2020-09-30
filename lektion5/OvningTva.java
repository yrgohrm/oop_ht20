public class OvningTva {
    private static Car createCar(String regno, String model, int year, int weight, int power) {
        Car car = new Car();
        car.setRegno(regno);
        car.setModel(model);
        car.setYear(year);
        car.setWeight(weight);
        car.setPower(power);
        return car;
    }
    public static void main(String[] args) {
        Car car1 = createCar("XYZ 12A", "Ford S-Max", 2019, 2401, 160);
        Car car2 = createCar("YYY 12A", "Ford C-Max", 2017, 2401, 160);
        Car car3 = createCar("XXX 12A", "Fårrden", 2015, 2401, 160);
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
