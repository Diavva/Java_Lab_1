import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */


        /* przykład b
         */

        Scanner scan = new Scanner(System.in);


        System.out.print("Podaj liczbę: ");
        double liczba = scan.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        double liczb2 = scan.nextInt();

        System.out.print("Suma: " + (liczba + liczb2) );

        System.out.print(" Różnica:" + (liczba - liczb2));

        System.out.print(" Illoczyn: " + (liczba * liczb2));

        System.out.print(" Iloraz: " + (liczba / liczb2));

        System.out.print(" Moduło: ");


    }

}
