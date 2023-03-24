package Zadania1podste;
import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double liczba_sadzonek, dl_rzedu, zajete_miejsce, odleglosc_sadzonek;
        System.out.println("Podaj dl rzedu w metrach: ");
        dl_rzedu = pobieranie.nextDouble();
        System.out.println("Ilosc zajetego miejsca: ");
        zajete_miejsce = pobieranie.nextDouble();
        System.out.println("Odleglosc miedzy sadzakami: ");
        odleglosc_sadzonek = pobieranie.nextDouble();
        liczba_sadzonek = (dl_rzedu-2*zajete_miejsce)/odleglosc_sadzonek;
        System.out.println("Liczba sadzonek ile sie zmiesci w jednym rzedzie: "
        + liczba_sadzonek);
    }
}
