import java.util.*;

public class Main {
    public static void main(String[] args) {
        Studenti studente1 = new Studenti("Elian Bertola",23);
        Studenti studente2 = new Studenti("Carlo Montanari", 32);
        Studenti studente3 = new Studenti("Lionel Messi", 36);
        Studenti studente4 = new Studenti("Cristiano Ronaldo",38);
        Studenti studente5 = new Studenti("Neymar jr.", 31);
        Studenti studente6 = new Studenti("Lebron James", 38);
        Studenti studente7 = new Studenti("Stephen Curry", 35);
        Studenti studente8 = new Studenti("Manuel Ginobili", 46);
        Studenti studente9 = new Studenti("Valentino Rossi", 44);

        List<Studenti> listaStudenti = Arrays.asList(studente1,studente2,studente3,studente4,studente5,studente6,studente7,studente8,studente9);

        System.out.println(listaStudenti);

        listaStudenti.sort(Comparator.comparing(Studenti::getName));

        System.out.println("Lista ordinata alfabeticamente: " + listaStudenti);

    }
}