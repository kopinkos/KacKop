package Zadania1podste;
import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double cena_detaliczna, zysk;
        System.out.println("Jaka jest cena detaliczna plytki podaj: ");
        cena_detaliczna = pobieranie.nextDouble();
        zysk = cena_detaliczna * 0.4;
        System.out.println("Zysk z jednej plytki bedzie wynosil: " + zysk);

    }
}
