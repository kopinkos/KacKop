package Zadania2_if;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbe: ");
        liczba = pobieranie.nextInt();
        System.out.println("Liczba rzymska: ");
        switch (liczba){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;

        }
    }
}
