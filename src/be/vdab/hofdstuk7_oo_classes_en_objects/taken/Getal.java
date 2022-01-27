package be.vdab.hofdstuk7_oo_classes_en_objects.taken;

public class Getal {
    private int x;

    public Getal(int a) {
        x = a;
    }

    public void print() {
        System.out.println(x);
    }

    public int absoluut() {
        return (int) Math.abs(x);
    }
}
