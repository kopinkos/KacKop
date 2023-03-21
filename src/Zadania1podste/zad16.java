package Zadania1podste;
import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        String miasto, male, duze;
        int ile_liter;
        char pierwsza_litera;
        System.out.println("Jakie jest twoje ulubione miasto: ");
        miasto = pobieranie.nextLine();
        ile_liter = miasto.length();
        duze = miasto.toUpperCase();
        male = miasto.toLowerCase();
        pierwsza_litera =miasto.charAt(0);
        System.out.println(ile_liter + "\n" + duze + "\n" + male + "\n"
                + pierwsza_litera);

    }
}
