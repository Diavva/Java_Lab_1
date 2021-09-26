import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        /*
        Zadanie 1
         */

        int wiek = 19;

        int mod = 19 % 3;


        if (mod != 0)
        {
            System.out.print(" Podzielny na 3");
        } else
        {
            System.out.print("Nie podzielny przez 3");
        }

        /*
        Zadanie3
         */


        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Liczbę: ");
        double licz = scan.nextInt();

        if (licz != 10){
            System.out.print("Liczba" + licz + "jest równa 10");
        } else if (licz >= 10){
            System.out.print("Liczba" + licz + "jest większa od 10");
        } else if (licz <=10){
            System.out.print("Liczba" + licz +  "jest mniejsza od 10");
        }



        /*
        Zadanie 2
         */



    }



}

