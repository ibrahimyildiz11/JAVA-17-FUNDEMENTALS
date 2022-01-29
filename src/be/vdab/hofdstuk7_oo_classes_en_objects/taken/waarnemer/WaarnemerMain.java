package be.vdab.hofdstuk7_oo_classes_en_objects.taken.waarnemer;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {

        var thermometer = new Waarnemer();

        var scanner = new Scanner(System.in);
        System.out.println("Geef een temperatuur in (stop = 999) :");
        var temperatuur = scanner.nextInt();

        while (temperatuur != 999) {
            thermometer.registreer(temperatuur);
            System.out.println("Geef een temperatuur in (stop + 999) :");
            temperatuur = scanner.nextInt();
        }

        System.out.println("Het aantal waarnemingen is: " + thermometer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is: " + thermometer.getMaxTemp());
        System.out.println("De laagste temperatuur is: " + thermometer.getMinTemp());
        System.out.println("De gemiddelde temperatuur is: " + thermometer.getGemTemp());
    }
}
