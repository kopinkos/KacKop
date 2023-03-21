package Zadania1podste;

public class zad18 {
    public static void main(String[] args) {
        double kwota_za_same_akcje, prowizja, laczna_kwota;
        kwota_za_same_akcje = 600 * 21.77;
        prowizja = kwota_za_same_akcje *0.02;
        laczna_kwota =kwota_za_same_akcje + prowizja;
        System.out.println("Same akcje kosztuja: " + kwota_za_same_akcje +
                " prowizja wynosi: " + prowizja + " laczna kwota to: "
                + laczna_kwota);

    }
}
