package be.vdab.hoofdstuk4.taken;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        var aantalSeconden = 5924;
        var uren = aantalSeconden/3600; //3600 sec in een uur
        var rest = aantalSeconden % 3600; //rest bevat resterende seconden

        var minuten = rest / 60;
        var seconden = rest % 60;

        System.out.println( "U:"+uren + " M:"+minuten + " S:"+seconden);

    }
}
