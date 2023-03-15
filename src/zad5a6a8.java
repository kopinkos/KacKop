public class zad5a6a8 {
    public static void main(String[] args) {
        int pokoj_nr1, pokoj_nr2, pokoj_nr3, pokoj_nr4, pole_calego_mieszkania;
        double dlugosc, szerokosc;
        System.out.println("Podaj wymiary dla pokoju nr.1");
        pokoj_nr1 = 2*(3*4);
        System.out.println("Podaj wymiary dla pokoju nr.2");
        pokoj_nr2 =;
        System.out.println("Podaj wymiary dla pokoju nr.3");
        pokoj_nr3 = 2*3;
        System.out.println("Podaj wymiary dla pokoju nr.4");
        pokoj_nr4 = 2*2;
        pole_calego_mieszkania = pokoj_nr1 + pokoj_nr3 + pokoj_nr4;
        System.out.println("Pole kazdego pokoju po kolei wynosi: \n" +
                "Pokoj nr.1: " + pokoj_nr1 + "\nPokoj nr.2: " + pokoj_nr2 + "\nPokoj nr.3: " + pokoj_nr3 +
        "\nPokoj nr.4: " + pokoj_nr4);
        System.out.println("Pole calego mieszkania wynosi: " + pole_calego_mieszkania);
        double metr_na_osobe;
        metr_na_osobe = (double)pole_calego_mieszkania /4;
        System.out.println("Metr kwadratowy przypadajacy na jedna osobe: " + metr_na_osobe);
    }
}
