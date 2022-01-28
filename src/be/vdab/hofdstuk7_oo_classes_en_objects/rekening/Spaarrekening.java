package be.vdab.hofdstuk7_oo_classes_en_objects.rekening;

public class Spaarrekening {
    private String rekeningNummer;
    private double saldo;
    private static double interest;

    public Spaarrekening(String rekeningNummer, double interest) {
        this.rekeningNummer = rekeningNummer;
        Spaarrekening.interest = interest;
    }

    public Spaarrekening(String rekeningNummer, double saldo, double interest) {
        this(rekeningNummer,interest);
        this.interest = interest;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void storten (double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }

    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag) && checkBedrag(saldo)) {
            saldo -= bedrag;
        }
    }

    public void overschrijven(Spaarrekening spaarRek, double bedrag) {
        if (checkBedrag(bedrag) && checkBedrag(saldo)) {
            saldo -= bedrag;
            spaarRek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }
}
