package Zadania2_if;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double wzrost, waga, BMI;
        System.out.println("Podaj swoja wage: ");
        waga = pobieranie.nextDouble();
        System.out.println("Podaj swoj wzrost: ");
        wzrost = pobieranie.nextDouble();
        BMI = waga/wzrost;
        if (BMI > 25){
            System.out.println("Masz nadwage");
        }
        else if (BMI < 18.5) {
            System.out.println("Masz niedowage");
        }
        else{
            System.out.println("W normie");
        }
    }
}
