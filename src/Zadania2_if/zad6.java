package Zadania2_if;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double sek, min, godz, dzien;
        System.out.println("Podaj ilosc sekund: ");
        sek = pobieranie.nextDouble();
        min= sek/60;
        godz = sek/3600;
        dzien = sek/86400;
        if(sek >= 60 && sek < 3600){
            System.out.printf( " %.2f sekund %.2f minut",sek, min);
        }
        else if(sek >= 3600 && sek < 86400){
            System.out.printf(" %.2f sekund %.2f minut %.2f godzin",sek, min, godz);
        }
        else if (sek >= 86400) {
            System.out.printf(" %.2f sekund %.2f minut %.2f godzin %.2f dnia",sek, min, godz, dzien);

        }
    }
}
