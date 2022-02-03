package be.vdab.strings;

public class Wrapper {
    public static void main(String[] args) {
        var tekst = "5.0";
        var temperatuur = Double.parseDouble(tekst);
        System.out.println(temperatuur);

        tekst = "7";
        var geluksgetal = Integer.parseInt(tekst);
        System.out.println(geluksgetal);

        var temperatuur1 = 5.0;
        var tekst1 = String.valueOf(temperatuur);
        System.out.println(tekst1);
        var geluksgetal1 = 7;
        tekst1 = String.valueOf(geluksgetal1);
        System.out.println(tekst1);
    }
}
