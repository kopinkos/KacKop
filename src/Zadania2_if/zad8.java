package Zadania2_if;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double pakiet, laczna_kwota, do_zaplaty;
        System.out.println("Podaj ilosc zakupionych pakietow: ");
        pakiet = pobieranie.nextDouble();
        if (pakiet >= 10 && pakiet <=19){
            laczna_kwota = 99 * 0.2;
            do_zaplaty =  99-laczna_kwota;
            System.out.println("Twoj rabat wynosi 20% a kwota za pakiet: " + do_zaplaty);
        }
        else if(pakiet >= 20 && pakiet <= 49){
            laczna_kwota = 99 * 0.3;
            do_zaplaty =  99-laczna_kwota;
            System.out.println("Twoj rabat wynosi 30% a kwota za pakiet: " + do_zaplaty);

        }
        else if (pakiet >= 50 && pakiet <= 99){
            laczna_kwota = 99 * 0.4;
            do_zaplaty =  99-laczna_kwota;
            System.out.println("Twoj rabat wynosi 40% a kwota za pakiet: " + do_zaplaty);
        }
        else {
            laczna_kwota = 99 * 0.5;
            do_zaplaty = 99-laczna_kwota;
            System.out.println("Twoj rabat wynosi 50% a kwota za pakiet: " + do_zaplaty);
        }
    }
}
