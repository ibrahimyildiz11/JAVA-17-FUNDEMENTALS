package be.vdab.hofdstuk6_programmaverloop.keuzestructuren;

public class Ternarie {
    public static void main(String[] args) {
        var a = 5;
        var b = 7;
        var grootste = a < b ? b : a;
        System.out.println("grootste is " + grootste);
    }
}
