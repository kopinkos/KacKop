package Zadania1podste;
import java.util.Scanner;
public class zad22 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double zysk, prowizja1, prowizja2, kwota_zaplacona, kwota_otrzymana;
        kwota_zaplacona = 1000 * 32.87;
        prowizja1 = kwota_zaplacona * 0.02;
        kwota_otrzymana = 1000 * 33.92;
        prowizja2 = kwota_otrzymana * 0.02;
        zysk = kwota_zaplacona - kwota_otrzymana;
        System.out.println("Zyks Jacka wynosi: " + zysk);
    }
}
