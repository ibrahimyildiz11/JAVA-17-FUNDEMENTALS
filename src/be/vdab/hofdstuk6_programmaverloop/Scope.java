package be.vdab.hofdstuk6_programmaverloop;

public class Scope {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //De main() method staat in een blok
        //en dit blok staat op zich in het blok van de class Scope.
        //Blokken kunnen geneest worden.
        var a = 5;
        {
            //Dit is een blok binnen het mainblok
            var b = 6;
            System.out.println("a is " + a );
            System.out.println("b is " + b );
        }
        System.out.println("a is " + a );
        //System.out.println("b is " + b ); //foutaanduiding
        /* De foutaanduiding geeft aan dat de variabele b niet gekend is in dit blok.
        De variabele b is enkel gekend in het binnenste blok.
        */
    }
}
