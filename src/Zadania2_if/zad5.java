package Zadania2_if;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double masa, ciezar;
        System.out.println("Jaka jest masa obiektu: ");
        masa = pobieranie.nextDouble();
        ciezar = masa * 9.8;
        if (ciezar > 1000){
            System.out.println("Obiekt jest zbyt ciezki");
        }
        else if (ciezar<10){
            System.out.println("Obiekt jest zbyt lekki");
        }
        else {
            System.out.println("Idealnie wywazone");
        }

    }
}
