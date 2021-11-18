package aufgabe;

import java.util.*;

public class Bibliothek {
    record Eintrag(Studierender studi, Buch buch) {
    }

    private static List<Eintrag> warteliste = new ArrayList<>();
    private static List<Buch> inventar = new SortedList<>();

    public static void main(String[] args) {
        System.out.println("arsch essen");
    }

    // Studierende können sich bei der Bibliothek auf Wartelisten für Bücher setzen
    // lassen.
    public static void addEintrag(Studierender studi, Buch buch) {
        warteliste.add(new Eintrag(person, buch));
    }

    private static void benachrichtige(Studierender studi, Buch buch) {
        // Die Bibliothek benachrichtigt die Studierenden nach dem FIFO-Prinzip, wenn
        // das Buch verfügbar ist.
    }

    public void zurueckgeben(Buch buch) {
        inventar.add(buch);
        Studierender wartender = warteliste.stream().filter(e -> inventar.contains(e)).findFirst().get().studi;
        if (wartender != null)
            benachrichtige(wartender, buch);
    }
}
