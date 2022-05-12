package wsb.cw.prtest;

public class Testowa {

    public static void main(String[] args) {

        System.out.println("Pull Requests test");

        Klasa klasa = new Klasa(10);

        System.out.println(klasa);

        System.out.println(new Klasa2());

        Klasa3pbobinsk klasa3pbobinsk = new Klasa3pbobinsk("Jakiś tekst");

        System.out.println(klasa3pbobinsk);

        Square square = new Square(5);
        System.out.println( square.calculateArea() );
        System.out.println( square.calculateDiagonal() );
        System.out.println( square.calculatePerimetr() );
        System.out.println( square.calculateInscribedCircle() );
        System.out.println( square.calculateCircumscribedCircle() );
    }

}
