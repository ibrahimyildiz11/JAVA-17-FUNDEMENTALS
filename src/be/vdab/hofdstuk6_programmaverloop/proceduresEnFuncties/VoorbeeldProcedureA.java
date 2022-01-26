package be.vdab.hofdstuk6_programmaverloop.proceduresEnFuncties;
import java.util.Arrays;

public class VoorbeeldProcedureA {
    public static void main(String[] args) {
        var getallen = new int[50];

        //GENEREREN VAN 50 WILLEKEURIGE GETALLEN
        for (var i = 0; i < getallen.length ; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }
        //TOON ONGESORTEERD RESULTAAT
        System.out.println("Ongesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
        System.out.println("");

        //SORTEREN VAN DE 50 GETALLEN
        Arrays.sort(getallen);

        //TOON GESORTEERD RESULTAAT = HERHALING VAN CODE!!
        System.out.println("Gesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
    }
}
