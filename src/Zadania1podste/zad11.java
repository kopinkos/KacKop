package Zadania1podste;

import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double produkt, cena, plokalny, pstanowy;
        System.out.println("Ile kosztowal produkt: ");
        produkt = pobieranie.nextDouble();
        plokalny = produkt * 0.02;
        pstanowy = produkt * 0.04;
        cena = produkt + 0.02 + 0.04;
        System.out.println("Cena produktu wraz z podakiem wynosi: " + cena +
                "  ,sam produkt kosztuje: " + produkt + " ,podatek lokalny: "
        + plokalny + " ,podatek stanowy kosztuje: " + pstanowy);
    }
}
