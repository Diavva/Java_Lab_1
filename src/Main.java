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


        /*  Zad 1
          */

        byte newbyte = 53;
        System.out.print("To przykład typu  danych byte: " + newbyte + ", przedstawia on liczbę w zakresie od -128 do 127.");

        short nshort = 5673;
        System.out.print("To przykład typu danych short: " + nshort + ", przedstawia on liczbę w zakresie od -32 768 do 32 767.");

        int ni = 336622;
        System.out.print("To przykład typu danych int: " + ni + ", przedstawia on liczbę w zakresie od -2 147 483 648 do 2 147 483 647");

        long nlon = 90000000001L;
        System.out.print("To przykład typu danych long:" + nlon + ", przedstawia on liczbę w zakresie od -9 223 372 036 854 775 808 do 9 223 372 036 854 775 807");

        float nflow = 33.254f;
        System.out.print("To przykład typu danych float: " + nflow + ", przedstawia ona liczbę ułamkową jako 6-7 cyfr dziesiętnych");

        double ndub = 44.6;
        System.out.print("To przykład typu danych " + ndub + ", przedstawia ona liczbę ułamkową do 15 cyfr dziesiętnych");

        boolean tof = false;
        System.out.print("Typ danych boolean, lub po prostu bool przechowuje wartości true (prawda) lub false (fałsz). W tym przypadku przechowuje on wartość: " + tof);

        char newcar = 'r';
        System.out.print("Typ danych char jest przypisany do pojedyńczych znaków, liter lub wartości kodu ASCII. W tym przypadku jest ona przypisana do " + newcar);

        String newstring = "Hello! This is a string!";
        System.out.print("Typ danych String przechowuje cale zdania (Stringiem może być też jedno słowo, ale w większości przypadków jest to całe zdanie.) Na przykład: " + newstring);


        /* Zadanie 2 przykład a
         */

        Scanner scan = new Scanner(System.in);


        System.out.print("Podaj liczbę: ");
        int liczba = scan.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczb2 = scan.nextInt();

        System.out.print("Suma: " + (liczba + liczb2) );

        System.out.print(" Różnica:" + (liczba - liczb2));

        System.out.print(" Illoczyn: " + (liczba * liczb2));

        System.out.print(" Iloraz: " + (liczba / liczb2));

        System.out.print(" Moduło: " + (liczba % liczb2));



        /* pzykład b

         */


        System.out.print("Podaj liczbę: ");
        double liczb3 = scan.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        double liczb4 = scan.nextInt();

        System.out.print("Suma: " + (liczb3 + liczb4) );

        System.out.print(" Różnica:" + (liczb3 - liczb4));

        System.out.print(" Illoczyn: " + (liczb3 * liczb4));

        System.out.print(" Iloraz: " + (liczb3 / liczb4));

        System.out.print(" Moduło: "+ (liczb3 % liczb4) );
    }

}
