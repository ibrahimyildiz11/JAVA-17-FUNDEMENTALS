package be.vdab.hofdstuk6_programmaverloop.taken;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("\nHoeveel huisdieren heb je?");
        var huisdieren = scanner.nextInt();
        switch (huisdieren) {
            case 0 -> System.out.println("Niet each verzot op dieren");
            case 1 -> System.out.println("Een eenzaam beestje?");
            case 2 -> System.out.println("Twee beestjes maken ruzie.");
            case 3 -> System.out.println("Drie beestjes, leuk!");
            default -> System.out.println("Zoveel dieren, lijkt wel klein Bokrijk!");
        }
    }
}
