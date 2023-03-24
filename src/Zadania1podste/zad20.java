package Zadania1podste;
import java.util.Scanner;
public class zad20 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double ilosc_ciasteczek, cukier, maslo, maka, porcja ;
        System.out.println("Ile chcesz upiec cisteczek");
        ilosc_ciasteczek = pobieranie.nextDouble();
        porcja = ilosc_ciasteczek/48;
        cukier = porcja*1.5;
        maslo = porcja*1;
        maka = porcja*2.75;
        System.out.println("Bedzie potrzeba tyle :" + cukier + " szklanek cukry " +
                "tyle szklanek masla" + maslo + " tyle szklanek maki " + maka);


    }
}
