package Zadania2_if;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        int dzien, miesiac, rok;
        System.out.println("Podaj dzien: ");
        dzien = pobieranie.nextInt();
        System.out.println("Podaj miesiac: ");
        miesiac = pobieranie.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        rok = pobieranie.nextInt();
        if(dzien * miesiac == rok){
            System.out.println("Ta data jest magiczna");
        }
        else {
            System.out.println("Ta data nie jest magiczna");
        }
    }
}
