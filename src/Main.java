import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        Scanner scan = new Scanner(System.in);


        System.out.print("Podaj pierwsze imię: ");
        String imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("" +
                "Podaj wiek: ");

        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu:");
        int indeks = scan.nextInt();

        System.out.printf("Imię i Nazwisko:  %s %s, Wiek: %d, Numer indeksu: %d.\n ", imie, nazwisko, wiek, indeks );



        /*
        zadanie 2
         */

        Scanner scan2 = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int licz1 = scan.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int licz2 = scan.nextInt();

        System.out.println("Suma: " +(licz1 + licz2) );
        System.out.println("Różnica: " + (licz1 - licz2));
        System.out.println("Iloczyn: " + (licz1 * licz2));
        System.out.println("Iloraz: " + (licz1 / licz2));
        System.out.print( licz1 % licz2);
    }
}
