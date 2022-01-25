package be.vdab.hofdstuk6_programmaverloop.taken;

public class ArrayVan5IntegersMetIteraties {
    public static void main(String[] args) {
        var getallen = new int[5];
        var som = 0;
        for (int teller = 0; teller <= getallen.length ; teller++) {
            getallen[teller] = (int) (Math.random()*100)+1;
            som += getallen[teller];
        }
        var gemiddelde = (float)som/getallen.length;

        System.out.println("De vijf getallen van de array: ");
        for (var getal: getallen) {
            System.out.println(getal);
        }
        System.out.println("De som van de vijf getallen: " + som);
        System.out.println("De gemiddelde waarde van de vijf getallen: " + gemiddelde);
    }
}
