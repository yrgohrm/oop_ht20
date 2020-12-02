public class App {
    public static void main(String[] args) {
        IceCream ice = new IceCream(IceCreamHolder.CUP);
        ice.addScoop(new IceCreamScoop("banana", 85));
        ice.addScoop(new IceCreamScoop("chocolate", 85));
        ice.addScoop(new IceCreamScoop("melon", 85));

        System.out.println(ice);
    }
}