package be.vdab.hofdstuk7_oo_classes_en_objects.rekening;

public class Main {
    public static void main(String[] args) {

        var intrestPercentage = Spaarrekening.getInterest(); // We gebruiken static method zonder een intantie
        System.out.println("Intrest persentage is: " + intrestPercentage);

        /************************************************************/

        double standSpaarrekening;

        var spar1 = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        var spar2 = new Spaarrekening("BE98 7654 3210 9876", 1.5);

        spar1.storten(100.0);
        standSpaarrekening = spar1.getSaldo();

        System.out.println("Saldo van spaarrekening 1: " + standSpaarrekening);
        System.out.println("Saldo van spaarrekening 2: " + spar2.getSaldo());

        spar1.overschrijven(spar2,-25.0);

        System.out.println("Saldo van spaarrekening 1 " + spar1.getRekeningNummer() + " is " + spar1.getSaldo());
        System.out.println("Saldo van spaarrekening 2 " + spar2.getRekeningNummer() + " is " + spar2.getSaldo());

        spar2.afhalen(5.0);
        System.out.println("Saldo van spaarrekening 2 " + spar2.getRekeningNummer() + " is " + spar2.getSaldo());

    }
}
