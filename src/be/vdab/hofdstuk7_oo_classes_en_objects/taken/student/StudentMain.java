package be.vdab.hofdstuk7_oo_classes_en_objects.taken.student;

public class StudentMain {
    public static void main(String[] args) {
        var student1 = new Student("Umberto");
        var student2 = new Student("Bart", 8);

        System.out.println("De score van " + student1.getNaam() + " is : " + student1.getScore());
        System.out.println("De score van " + student2.getNaam() + " is : " + student2.getScore());

        student1.setScore(9);
        student2.setNaam("Lili");

        System.out.println("De score van " + student1.getNaam() + " is : " + student1.getScore());
        System.out.println("De score van " + student2.getNaam() + " is : " + student2.getScore());

    }
}
