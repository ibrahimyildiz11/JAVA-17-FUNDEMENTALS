package be.vdab.hofdstuk9_inheritance;

public class Spaarrekening extends Rekening{
    private static double intrest;

    public Spaarrekening(String rekeningNummer, double intrest) {
        this(rekeningNummer, intrest, 0.0);
    }

    public Spaarrekening(String rekeningNummer, double intrest, double saldo) {
        super(rekeningNummer, saldo);
        Spaarrekening.intrest = intrest;
    }

    public static double getIntrest() {
        return intrest;
    }

    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo() - bedrag;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }
}
