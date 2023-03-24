package Zadania2_if;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner pobieranie = new Scanner(System.in);
        double ocena1, ocena2, ocena3, srednia, suma;
        System.out.println("Podaj pkt z testu nr.1: ");
        ocena1 =pobieranie.nextDouble();
        System.out.println("Podaj pkt z testu nr.2: ");
        ocena2 = pobieranie.nextDouble();
        System.out.println("Podaj pkt z testu nr.3: ");
        ocena3 = pobieranie.nextDouble();
        suma = ocena1 + ocena2 + ocena3;
        srednia = suma/3;
        if(srednia>=90){
            System.out.println("Twoja ocena to 5 poniewaz masz srednia: " + srednia);

        }
        else if (srednia >= 80 && srednia <= 89) {
            System.out.println("Twoja ocena to 4 poniewaz masz srednia: " + srednia);
        }
        else if (srednia >= 70 && srednia <= 79) {
            System.out.println("Twoja ocena to 3 poniewaz masz srednia" + srednia);
        }
        else if (srednia >= 60 && srednia<= 69) {
            System.out.println("Twoja ocena to 2 poniewaz masz srednia" + srednia);
        }
        else {
            System.out.println("Twoja ocena to 1");
        }
    }
}
