package be.vdab.hofdstuk8_records;

public class PersoonMain {
    public static void main(String[] args) {
        var persoon = new Persoon("Jos", "De Bie");
        //System.out.println(persoon.achternaam());
        //System.out.println(persoon.voornaam());

        System.out.println(persoon);
        System.out.println(persoon.hashCode());

        System.out.println(persoon.getClass());
    }
}
