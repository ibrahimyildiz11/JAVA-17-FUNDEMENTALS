package be.vdab.strings;

import java.util.Locale;

public class StringsWijzigenMethoden {
    public static void main(String[] args) {

        // replace() ==>  Public String replace(char oldChar, char newChar)
        var woord = "hallo";
        System.out.println(woord);
        woord = woord.replace("a", "e");
        System.out.println(woord);


        // toLowerCase() ==> public String toLowerCase();
        var woord2 = "Hallo";
        System.out.println(woord2);
        woord2  = woord2.toLowerCase();
        System.out.println(woord2);

        //toUpperCase() ==> public String toUpperCase();
        woord2 = woord2.toUpperCase();
        System.out.println(woord2);

        //trim() ==> public String trim(); ==> trim() verwijdert ‘whitespaces’ (witruimtes) voor en achter de tekst
        // van de string variabele.
        var woord3 = "       Hallo mevrouw               ";
        woord3 = woord3.trim();
        System.out.println(woord3);

        //indent() ==> public String indent(int n); ==> Deze method past de inspringing van elke regel van de string
        // aan op basis van het argument dat wordt meegegeven

        woord3 = woord3.indent(2);
        System.out.println(woord3);
        woord3 = woord3.indent(2);
        System.out.println(woord3);


    }
}
