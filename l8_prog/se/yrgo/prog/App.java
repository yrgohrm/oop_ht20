package se.yrgo.prog;

import com.google.common.math.IntMath;
import se.yrgo.lib.CoolStuff;

public class App {
    public static void main(String[] args) {
        CoolStuff cs = new CoolStuff();
        cs.doIt();

        System.out.println(IntMath.gcd(100, 250));
    }
}