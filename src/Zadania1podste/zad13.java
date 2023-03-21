package Zadania1podste;

import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        int ilosc_zjedzonych_ciesteczek, kalorie;
        System.out.println("Ile zjadlesc ciasteczek: ");
        ilosc_zjedzonych_ciesteczek = pobieranie.nextInt();
        kalorie = 300/4 * ilosc_zjedzonych_ciesteczek;
        System.out.println(kalorie + " ilosc kalori ktore " +
                "w sobie posiadasz");

    }
}
