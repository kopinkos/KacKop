package Zadania1podste;
import java.util.Scanner;
public class zad21 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double kwota_poczatkowa, roczna_stopa_oprocentowania, lata, kapitalizacja_odestkow, kwota_poczasie;
        double k1, k2, k3;
        System.out.println("Jaka byla kwota poczatkowa: ");
        kwota_poczatkowa = pobieranie.nextDouble();
        System.out.println("Jaka jest roczna stopa oprocentowania: ");
        roczna_stopa_oprocentowania = pobieranie.nextDouble()/100;
        System.out.println("Ile razy w roku odsetki sa doliczone do kapitalu: ");
        kapitalizacja_odestkow = pobieranie.nextDouble();
        System.out.println("Ile lat: ");
        lata = pobieranie.nextDouble();
        k1 = 1+roczna_stopa_oprocentowania/kapitalizacja_odestkow;
        k2= kapitalizacja_odestkow *lata;
        k3 = Math.pow(k1, k2);
        kwota_poczasie = kwota_poczatkowa * k3;
        System.out.println("Kwota jaka znjadziesz na koncie po okreslonym czasie:"
        + kwota_poczasie);


    }
}
