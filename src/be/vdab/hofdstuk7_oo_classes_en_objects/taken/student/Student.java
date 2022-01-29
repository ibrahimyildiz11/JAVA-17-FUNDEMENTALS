package be.vdab.hofdstuk7_oo_classes_en_objects.taken.student;

public class Student {
    private String naam;
    private int score;

    public Student(String naam) {
        this.naam = naam;
    }

    public Student(String naam, int score) {
        this(naam);  //oproep vorige constructor ipv this.naam = naam;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
