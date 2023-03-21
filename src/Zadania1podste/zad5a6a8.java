package Zadania1podste;

import java.util.Scanner;
public class zad5a6a8 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double pokoj_nr1, pokoj_nr2, pokoj_nr3, pokoj_nr4, pole_calego_mieszkania;
        double dlugosc, szerokosc, dlugosc2, szerokosc2, dlugosc3, szerokosc3, dlugosc4, szerokosc4;
        System.out.println("Podaj wymiary dla pokoju nr.1");
        System.out.println("Podaj dlugosc: ");
        dlugosc = pobieranie.nextDouble();
        pobieranie.nextLine();
        System.out.println("Podaj szerokosc: ");
        szerokosc = pobieranie.nextDouble();
        pokoj_nr1 = dlugosc * szerokosc;
        System.out.println("Podaj wymiary dla pokoju nr.2");
        System.out.println("Podaj dlugosc: ");
        dlugosc2 = pobieranie.nextDouble();
        pobieranie.nextLine();
        System.out.println("Podaj szerokosc: ");
        szerokosc2 = pobieranie.nextDouble();
        pokoj_nr2 = dlugosc2 * szerokosc2;
        System.out.println("Podaj wymiary dla pokoju nr.3");
        System.out.println("Podaj dlugosc: ");
        dlugosc3 = pobieranie.nextDouble();
        pobieranie.nextLine();
        System.out.println("Podaj szerokosc: ");
        szerokosc3 = pobieranie.nextDouble();
        pokoj_nr3 = dlugosc3 * szerokosc3;
        System.out.println("Podaj wymiary dla pokoju nr.4");
        System.out.println("Podaj dlugosc: ");
        dlugosc4 = pobieranie.nextDouble();
        pobieranie.nextLine();
        System.out.println("Podaj szerokosc: ");
        szerokosc4 = pobieranie.nextDouble();
        pokoj_nr4 = dlugosc4 * szerokosc4;
        pole_calego_mieszkania = pokoj_nr1 + pokoj_nr3 + pokoj_nr4;
        System.out.println("Pole kazdego pokoju po kolei wynosi: \n" +
                "Pokoj nr.1: " + pokoj_nr1 + "\nPokoj nr.2: " + pokoj_nr2 + "\nPokoj nr.3: " + pokoj_nr3 +
        "\nPokoj nr.4: " + pokoj_nr4);
        System.out.println("Pole calego mieszkania wynosi: " + pole_calego_mieszkania);
        double metr_na_osobe;
        metr_na_osobe = (double)pole_calego_mieszkania /4;
        System.out.println("Metr kwadratowy przypadajacy na jedna osobe: " + metr_na_osobe);
    }
}
