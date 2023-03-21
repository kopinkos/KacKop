package Zadania1podste;
import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double ocena1, ocena2, ocena3, srednia;
        System.out.println("Jaka ocena z pierwszego testu: ");
        ocena1 = pobieranie.nextDouble();
        System.out.println("Jaka ocena z drugiego testu: ");
        ocena2 = pobieranie.nextDouble();
        System.out.println("Jaka ocena z trzeciego testu: ");
        ocena3 = pobieranie.nextDouble();
        srednia = (ocena1 + ocena2 + ocena3)/3;
        System.out.println("Wyniki testu nr.1: " + ocena1 + " Wyniki testu nr.2: " +
                ocena2 + " Wyniki testu nr.3: " + ocena3 + " Srednia z testow: " +
                srednia);
    }
}
