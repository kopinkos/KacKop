package Zadania1podste;

import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        String first_name, middle_name, last_name;
        char first_initial, middle_initial, last_initial;
        System.out.println("Jak masz na imie: ");
        first_name = pobieranie.nextLine();
        System.out.println("Jakie jest twoje drugie imie: ");
        middle_name = pobieranie.nextLine();
        System.out.println("Jak masz na nazwisko: ");
        last_name = pobieranie.nextLine();
        first_initial = first_name.charAt(0);
        middle_initial = middle_name.charAt(0);
        last_initial = last_name.charAt(0);
        System.out.println("Masz na imie: " + first_name + " " + middle_name +
                " " + last_name);
        System.out.println("A twoje inicialy to:" + first_initial + middle_initial
        + last_initial);
    }
}
