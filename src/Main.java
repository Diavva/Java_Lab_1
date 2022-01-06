import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */


        Scanner scan = new Scanner(System.in);

        int x = 4;
        int y = 6;
        int z = 4;

        System.out.println("Operatory porównania: "+ "x = "+x +" y = "+ y +" z = " + z );

        System.out.println("x != y: " + (x != y));
        System.out.println( "x == z: " + (x==z) );
        System.out.println("z <= y: " +(z<=y));
        System.out.println("x >= y: " +(x>=y));



        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.print("Operatory arytmetyczne:" + "\na = true\tb = true\tc = false");
        System.out.println("!a: " + !a);
        System.out.println("!c: " + !c);
        System.out.println("(a || b ) = " + (a || b));
        System.out.println("(a || c ) = " + (a || c));
        System.out.println("!(a && c) = " + !(a && c));
        System.out.println("!((a && b) || (!a || c) = " + !((a && b) || (!a || c) ));

    }
}
