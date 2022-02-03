package be.vdab.strings;

public class Splitsen {
    public static void main(String[] args) {
        var tekst = "Dit is een stukje tekst";
        var stukjes = tekst.split(" ");
        System.out.println("String[ ] voorbeeld.split(String regex):");
        for (var stukje : stukjes) {
            System.out.println(stukje);
        }

        System.out.println("\nString[ ] voorbeeld.split(String regex, int limit)");
        stukjes = tekst.split(" ", 3);
        for (var stukje : stukjes) {
            System.out.println(stukje);
        }
    }
}
