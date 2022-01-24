package be.vdab.hofdstuk6_programmaverloop.keuzestructuren;

public class IfInstructie {
    public static void main(String[] args) {
        var getal1 = 6;
        if (getal1 % 2 == 0) {
            System.out.println("Het getal1 " + getal1 + " is even.");
        }

        var getal2 = 7;
        if(getal2 % 2 ==0)
            System.out.println("Het getal " + getal2 + "is even.");
        else
            System.out.println("Het getal " + getal2 + " is oneven.");

        /*In geval er meerdere statements uitgevoerd dienen te worden, hetzij in de if, hetzij in de else,
        dienen deze statements in een blok geplaatst te worden. Tussen accolades dus, zoals bij de syntax is
        weergegeven*/
        var getal3 = 10;
        var getal4 = 0;
        if(getal3 % 2 == 0){
            System.out.println("Het getal " + getal3 + " is even");
            getal4 = getal3 * 3;
        }
    }
}
