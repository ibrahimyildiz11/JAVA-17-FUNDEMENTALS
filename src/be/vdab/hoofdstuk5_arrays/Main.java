package be.vdab.hoofdstuk5_arrays;

public class Main {
    public static void main(String[] args) {
        Dier dierreference = new Hond(); // downcasting
        Hond tobby = (Hond) dierreference; // upcasting
        tobby.blaf();

        Dier dier = new Dier();
        Dier dier2 = new Hond();
        Dier joey = new Kat();
        Hond tobby1 = (Hond) dier2;
        //Hond jussi = (Hond) joey;

        tobby.wie();
        joey.wie();
        //jussi.wie();

    }
}
