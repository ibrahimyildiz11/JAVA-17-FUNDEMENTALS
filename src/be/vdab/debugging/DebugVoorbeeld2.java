package be.vdab.debugging;

public class DebugVoorbeeld2 {
    public static void main(String[] args) {
        var tekst = "Ik ben een Java Developer";
        System.out.println(plaatsAchterElkeStringEenPunt(tekst));
    }
    private static String plaatsAchterElkeStringEenPunt(String eenString) {
        if (!eenString.endsWith(".")) {
            eenString = eenString.concat(".");
        }
        return eenString;
    }
}
