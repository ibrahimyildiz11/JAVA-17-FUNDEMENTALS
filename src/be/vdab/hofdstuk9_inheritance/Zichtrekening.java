package be.vdab.hofdstuk9_inheritance;

public class Zichtrekening extends Rekening{
    private int maxKrediet;

    public Zichtrekening(String rekeningNummer, int bedrag) {
        this(rekeningNummer, 0.0, bedrag);
    }

    public Zichtrekening(String rekeningMunner, double saldo, int bedrag) {
        super(rekeningMunner, saldo);
        maxKrediet = bedrag;
    }

    public int getMaxKrediet() {
        return maxKrediet;
    }

    public void setMaxKrediet(int maxKrediet) {
        this.maxKrediet = maxKrediet;
    }

    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo() - bedrag + maxKrediet;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }
}
