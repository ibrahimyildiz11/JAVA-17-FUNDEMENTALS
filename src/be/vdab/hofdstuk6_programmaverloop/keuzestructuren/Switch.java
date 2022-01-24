package be.vdab.hofdstuk6_programmaverloop.keuzestructuren;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Geef een keuze in van 1 tot 3: ");
        var scanner = new Scanner(System.in);
        var menuKeuze = scanner.nextInt();
        switch (menuKeuze) {
            case 1:
                System.out.println("Keuze 1");
                break;
            case 2:
                System.out.println("Keuze 2");
                break;
            case 3:
                System.out.println("Keuze 3");
                break;
            default:
                System.out.println("Geen keuze 1 tot 3 gegeven.");
                break;
        }

        //EEN VOORBEELD MET STRINGS:
       /* boolean isWeekend;
        System.out.println("Geef de dag: ");
        var dag = scanner.next();
        switch (dag) {
            case "maandag":
            case "dinsdag":
            case "woensdag":
            case "donderdag":
            case "vrijdag":
                isWeekend = false;
                break;
            case "zaterdag":
            case "zondag":
                isWeekend = true;
                break;
            default:
                throw new IllegalArgumentException(dag + " bestaat niet");
        }
        System.out.println(isWeekend ? dag + " is weekend" : dag + " is een werkdag.");*/

        System.out.println("Geef de dag:");
        var dag = scanner.next();

        /*boolean isWeekend = switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag"  -> false;
            case "zaterdag", "zondag" -> true;
            default -> throw new IllegalArgumentException(dag + " bestaat niet.");
        };
        System.out.println(isWeekend ? dag + " is weekend." : dag + " is een werkdag." );*/

        //Je kan het voorbeeld ook wijzigen door geen return waarde terug te geven, maar direct het resultaat
        //printen:
        switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" ->
                    System.out.println("Werkdag");
            case "zaterdag", "zondag" -> System.out.println("Weekend");
            default -> throw new IllegalArgumentException(dag + " bestaat niet");
        }


    }


}
