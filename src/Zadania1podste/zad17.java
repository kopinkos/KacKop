package Zadania1podste;
import java.util.Scanner;
public class zad17 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double cena_posilku, podatek, napiwek, kwota_laczna;
        System.out.println("Ile kosztowal twoj posilek; ");
        cena_posilku = pobieranie.nextDouble();
        podatek = cena_posilku * 0.0675;
        napiwek = (cena_posilku + podatek) * 0.2;
        kwota_laczna = cena_posilku + napiwek + podatek;
        System.out.println("Cena posilku wynosi: " + cena_posilku + " podatek wynsoi: " +
                podatek + " napiwek wynosi: " + napiwek + " a calkowita kwota do zaplaty: "
                + kwota_laczna);
    }
}
