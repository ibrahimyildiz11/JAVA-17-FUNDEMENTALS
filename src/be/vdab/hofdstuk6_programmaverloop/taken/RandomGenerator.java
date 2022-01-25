package be.vdab.hofdstuk6_programmaverloop.taken;

public class RandomGenerator {
    public static void main(String[] args) {
        var getallen = new int[100]; //automatische initialisatie op 0
        for (int teller = 0; teller < 10_000 ; teller++) {
            var randGetal = (int) (Math.random()*100)+1;
            getallen[randGetal-1]++;
        }

        for (int i = 0; i < getallen.length ; i++) {
            System.out.println("getal " + (i+1) + " : " + getallen[i]);
        }
    }
}
