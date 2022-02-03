package be.vdab.strings;

public class StringOnderzoekenMethoden {
    public static void main(String[] args) {
        //length(): geeft het aantal tekens van een string.
        //join(): strings samenvoegen doormiddel van een bepaalde afbakening.
        var woord1 = "Hello";
        var woord2 = "World";
        var woord3 = String.join(" * ", woord1, woord2, "again");
        System.out.println("***** method join() *****");
        System.out.println(woord3+"\n");
        System.out.println("***** method length() *****");
        System.out.println(woord3.length() + "\n");

        //isEmpty():  geeft true enkel en alleen indien de lengte (lenght()) van een string 0 is. In het andere
        //geval is het resultaat false.
        System.out.println("***** method isEmpty() *****");
        System.out.println(woord3.isEmpty() + "\n");

        //substring(): kopieert een deel van de string
        //public String substring(int beginIndex, int eindIndex)
        System.out.println("***** method substring() *****");
        System.out.println(woord3.substring(3, 10) + "\n");

        //charAt(): retourneert het ‘character’ dat op een bepaalde positie staat
        //public char charAt(int index)
        System.out.println("***** method charAt() *****");
        System.out.println(woord3.charAt(14));

        System.out.println("***** indexOf() en lastIndexOf() *****");
        System.out.println(woord3.indexOf("H"));
        System.out.println(woord3.lastIndexOf("Ssel"));
    }
}
