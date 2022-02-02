package be.vdab.strings;

import java.util.Locale;

public class StringsWijzigenMethoden {
    public static void main(String[] args) {

        // replace() ==>  Public String replace(char oldChar, char newChar)
        var woord = "hallo";
        System.out.println(woord);
        woord = woord.replace("a", "e");
        System.out.println(woord);


        // toLowerCase()
        var woord2 = "Hallo";
        System.out.println(woord2);
        woord2  = woord2.toLowerCase();
        System.out.println(woord2);
    }
}
