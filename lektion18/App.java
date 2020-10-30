public class App {
    public App() {
        var x = 22;
    }

    private static Pair2<String, String> returnTwoThings() {
        Pair2<String, String> p = new Pair2<>();
        p.value1 = "Hejsan";
        p.value2 = "22"; //Integer.valueOf(22);
        return p;
    }


    public static void main(String[] args) {
        var retVal = returnTwoThings();
        var str = retVal.value1;
        var i = retVal.value2;

        System.out.println(str + " " + i);
    }
}