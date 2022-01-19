package be.vdab.hoofdstuk5_arrays;

public class VijfIntegers {
    public static void main(String[] args) {
        var getallen = new int[5];
        getallen[0] = (int) (Math.random()*100)+1;
        getallen[1] = (int) (Math.random()*100)+1;
        getallen[2] = (int) (Math.random()*100)+1;
        getallen[3] = (int) (Math.random()*100)+1;
        getallen[4] = (int) (Math.random()*100)+1;

        var som = getallen[0]+ getallen[1]+ getallen[2]+ getallen[3]+getallen[4];
        var gemiddelde = (float)som/getallen.length;

        System.out.println("De vijf getallen van de array: ");
        System.out.println(getallen[0]);
        System.out.println(getallen[1]);
        System.out.println(getallen[2]);
        System.out.println(getallen[3]);
        System.out.println(getallen[4]);
        System.out.println("De som van de vijf getallen: " + som);
        System.out.println("De gemiddelde waarde van de vijf getallen: " + gemiddelde);


    }
}
