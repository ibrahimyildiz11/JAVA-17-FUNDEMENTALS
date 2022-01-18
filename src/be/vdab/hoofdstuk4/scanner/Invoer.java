package be.vdab.hoofdstuk4.scanner;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
        System.out.println("Geef een getal: ");
        var scanner = new Scanner(System.in);
        var getal = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Geef en tekst: ");
        var tekst = scanner.nextLine();
        System.out.println(getal);
        System.out.println(tekst);
    }
}
