import java.util.Scanner;

public class Ovning5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hur långt är brevet i mm?");
        int width = scan.nextInt();

        System.out.println("Hur brett är brevet i mm?");
        int height = scan.nextInt();

        System.out.println("Hur tjockt är brevet i mm?");
        int thickness = scan.nextInt();

        if (width < height) {
            System.out.println("Du har matat in i fel ordning. Gör om gör rätt.");
            System.exit(1);
        }

        if (height < thickness) {
            System.out.println("Du har matat in i fel ordning. Gör om gör rätt.");
            System.exit(1);
        }

        /*
        if (width > 600 
            || thickness > 100 
            || (width + height + thickness) > 900
            || width < 140 
            || height < 90) {
            System.out.println("Ej tillåtet");
        }
        else {
            System.out.println("Tillåtet");
        }
        */

        if (width > 600) {
            System.out.println("Ej tillåtet. Längden är för stor!");
        }
        else if (thickness > 100) {
            System.out.println("Ej tillåtet. Bredden är för stor.");
        }
        else if ((width + height + thickness) > 900) {
            System.out.println("Ej tillåtet. Total storlek är för stor.");
        }
        else if (width < 140 || height < 90) {
            System.out.println("För litet!");
        }
        else {
            System.out.println("Ej tillåtet");
        }

        /*
        boolean tooLong = width > 600;
        boolean tooThick = thickness > 100;
        boolean tooBig = (width + height + thickness) > 900;
        boolean tooSmallWidth = width < 140;
        boolean tooSmallHeight = height < 90;

        if (tooLong || tooThick || tooBig || tooSmallWidth || tooSmallHeight) {
            System.out.println("Ej tillåtet");
        }
        else {
            System.out.println("Tillåtet");
        }*/
    }
}
