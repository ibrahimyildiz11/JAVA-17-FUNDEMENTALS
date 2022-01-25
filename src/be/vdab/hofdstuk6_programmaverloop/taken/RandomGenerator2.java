package be.vdab.hofdstuk6_programmaverloop.taken;

import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];

        for (int i = 0; i < getallen.length ; i++) {
            getallen[i] = (int) (Math.random()*1000 + 1);
        }

        //SORTEN VAN DE 100 GETALLEN

        /*for (int pos = 0; pos < getallen.length - 1 ; pos++) {
            for (int vgl = pos+1; vgl < getallen.length; vgl++) {
                if (getallen[pos] > getallen[vgl]) {
                    var tempGetal = getallen[pos];
                    getallen[pos] = getallen[vgl];
                    getallen[vgl] = tempGetal;
                }
            }
        }*/
        Arrays.sort(getallen); //In plaats van de sorteerroutine zelf te schrijven

        for (int i = 0; i < getallen.length; i++) {
            System.out.print(getallen[i] + "\t");
        }
    }
}
