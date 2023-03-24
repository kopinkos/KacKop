package Zadania2_if;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        String imie, imie2, imie3 ;
        System.out.println("Podaj trzy imiona");
        imie = pobieranie.nextLine();
        imie2 = pobieranie.nextLine();
        imie3 = pobieranie.nextLine();
        List<String> osoby = new LinkedList<>();
        osoby.add(imie);
        osoby.add(imie2);
        osoby.add(imie3);
        Collections.sort(osoby);
        System.out.println("Imiona alfabetycznie: " + osoby);
    }
}
