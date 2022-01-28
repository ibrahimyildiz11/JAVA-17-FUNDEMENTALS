package be.vdab.hofdstuk7_oo_classes_en_objects.taken;

public class Getal {
    private int x;

    public Getal(int a) {
       setX(a);
    }

    public void print() {
        System.out.println("X = " + x);
    }

    public int absoluut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return x+a;
    }

    public float som(float a) {
        return x+a;
    }

    public double som(double a) {
        return x+a;
    }

    public void add(int a) {
        x+= a;
    }

    public double toDouble() {
        return (double) x;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        x = a;
    }
}
