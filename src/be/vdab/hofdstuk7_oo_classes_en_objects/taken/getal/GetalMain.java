package be.vdab.hofdstuk7_oo_classes_en_objects.taken.getal;

public class GetalMain {
    public static void main(String[] args) {
        var getal1 = new Getal(-45);
        getal1.print();
        System.out.println(getal1.absoluut());
        System.out.println(getal1.som(6));

        var getal2 = new Getal(10);
        System.out.println("GETAL2: ");
        System.out.println("\t" + getal2.absoluut());
        getal2.add(5);
        System.out.print("\t");
        getal2.print();

        System.out.println(getal2.toDouble());
        getal2.print();

        getal2.setX(99);
        getal2.print();
        var xx = getal2.getX();
        System.out.println("getX geeft :" + xx);
    }
}
