package be.vdab.hoofdstuk4.taken;

public class StudentScore {
    public static void main(String[] args) {
        var score1 = 8;
        var score2 = 6;
        var score3 = 9;
        var score4 = 4;

        var totaalScore = score1 + score2 + score3 + score4;
        var gemiddelde = totaalScore/4F;
        var percentage = totaalScore / 40F * 100;

        System.out.println("Het gemiddelde score is " + gemiddelde + " op 10.");
        System.out.println("Het behaalde percentage is " + percentage + " %.");

    }
}
