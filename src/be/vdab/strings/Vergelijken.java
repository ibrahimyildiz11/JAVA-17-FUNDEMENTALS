package be.vdab.strings;

import java.util.Scanner;

public class Vergelijken {
    public static void main(String[] args) {
        var bedrijf = "VDAB";
        System.out.println("Typ de naam van de bedrij: ");
        var scanner = new Scanner(System.in);
        var invoerBedrijf = scanner.next();
        System.out.println(invoerBedrijf.equals(bedrijf));


        var tekst1 = "abc";
        var tekst2 = "abc";
        var tekst3 = new String("abc");

        System.out.println("tekst 1 en 2 met == " + (tekst1 == tekst2));
        System.out.println("tekst 1 en 2 met equals " + tekst1.equals(tekst2));

        System.out.println("tekst 1 en 3 met == " + (tekst1 == tekst3));
        System.out.println("tekst 1 en 3 met equals " + tekst1.equals(tekst3));
    }
}
