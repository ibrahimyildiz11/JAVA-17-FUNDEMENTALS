package be.vdab.hoofdstuk4.taken;

import java.util.Scanner;

public class Snoepautomaat {
    public static void main(String[] args) {
        var ingave = 10;
        var kost = 1.02;
        var terug = ingave * 100 - (int) (kost * 100);

        System.out.println("Kost van " + kost + " euro, en ingave van " + ingave + " euro");
        System.out.println("Automat geeft " + terug + " cent(en) terug");

        var munt100 = terug/100;
        terug -= munt100 * 100;

        var munt50 = terug / 50;
        terug -= munt50 * 50;

        var munt20 = terug / 20;
        terug -= munt20*20;

        var munt10 = terug/10;
        terug -= munt10*10;

        var munt5 = terug/5;
        terug-= munt5*5;

        var munt2 = terug/2;
        terug -= munt2*2;

        var munt1 = terug;

        System.out.println("Munten van 1 EUR    : " + munt100);
        System.out.println("Munten van 0,50 EUR : " + munt50);
        System.out.println("Munten van 0,20 EUR : " + munt20);
        System.out.println("Munten van 0,10 EUR : " + munt10);
        System.out.println("Munten van 0,05 EUR : " + munt5);
        System.out.println("Munten van 0,02 EUR : " + munt2);
        System.out.println("Munten van 0,01 EUR : " + munt1);
    }

}
