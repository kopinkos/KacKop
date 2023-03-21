package Zadania1podste;

import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double km_na_l, ile_przejechane, litry_paliwa;
        System.out.println("Ile przejechales: ");
        ile_przejechane = pobieranie.nextDouble();
        System.out.println("Ile wlales paliwa: ");
        litry_paliwa = pobieranie.nextDouble();
        km_na_l = ile_przejechane / litry_paliwa;
        System.out.println("Liczba kilometrow przejechanych na litrze paliwa: "
        + km_na_l);

    }
}















