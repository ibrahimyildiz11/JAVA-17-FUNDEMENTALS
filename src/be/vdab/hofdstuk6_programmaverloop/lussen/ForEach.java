package be.vdab.hofdstuk6_programmaverloop.lussen;

public class ForEach {
    public static void main(String[] args) {
        var getallen = new int [5];
        for (var teller = 0; teller <= 4; teller++) {
            getallen[teller] = teller + 20;
        }

        for (var getal:
             getallen) {
            System.out.println(getal);
        }
    }
}
