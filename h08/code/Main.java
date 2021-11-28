import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MAX_CAPITAL = 10000;
    private static final int MAX_COST = 100;

    private List<Kunde> kunden = new ArrayList<>();
    private List<Nachrichtenkanal> kanaele = new ArrayList<>();

    public void dialog() {
        int eingabe = -1;
        while (eingabe != 0) {
            System.out.println("Was wollen Sie?\n"
                    + " (0) Programm beenden\n"
                    + " (1) neuen Kunden erstellen\n"
                    + " (2) neuen Nachrichtenkanal erstellen\n"
                    + " (3) Kunde abonniert Nachrichtenkanal\n"
                    + " (4) Nachrichtenkanalstatistik\n"
                    + " (5) Nachricht eines Nachrichtenkanals veraendern");
            eingabe = new Scanner(System.in).nextInt();
            switch (eingabe) {
                case 1:
                    neuerKunde();
                    break;
                case 2:
                    neuerNachrichtenkanal();
                    break;
                case 3:
                    neuesAbonnement();
                    break;
                case 4:
                    nachrichtenkanalstatistik();
                    break;
                case 5:
                    nachrichtVeraendern();
                    break;
            }
        }
    }

    private String textEingeben(String aufforderung) {
        Scanner sc = new Scanner(System.in);
        System.out.print(aufforderung);
        return sc.nextLine();
    }

    // Koennte Java optionale Parameter, waere die Sprache nicht so ein kompletter
    // Scheiss wie ohnehin schon.
    private int nummerwaehlen(int size) {
        return nummerwaehlen(size, null);
    }

    // (-_-)
    private int nummerwaehlen(int size, String aufforderung) {
        int eingabe = -1;
        aufforderung = aufforderung == null ? "" : (" (" + aufforderung + ")");
        System.out.println("Bitte geben Sie eine Nummer zwischen 1 und "
                + size + " ein." + aufforderung);
        while (eingabe < 1 || eingabe > size) {
            eingabe = new Scanner(System.in).nextInt();
        }
        return eingabe;
    }

    private Nachrichtenkanal nachrichtenkanalWaehlen() {
        int i = 1;
        System.out.println("Welcher Nachrichtenkanal? ");
        for (Nachrichtenkanal n : kanaele)
            System.out.println(" (" + (i++) + ") " + n);
        return kanaele.get(nummerwaehlen(kanaele.size()) - 1);
    }

    private void nachrichtVeraendern() {
        Nachrichtenkanal nk = nachrichtenkanalWaehlen();
        nk.updateInhalt(textEingeben("Neuer Inhalt: "));
    }

    private void nachrichtenkanalstatistik() {
        int i = 1;
        for (Nachrichtenkanal n : kanaele) {
            System.out.println(" (" + (i++) + ") " + n);
            for (NachrichtenkanalObserver observer : n.getObservers())
                System.out.println("\t" + observer.getAbo());
        }
    }

    private void neuesAbonnement() {
        if (kunden.isEmpty()) {
            System.out.println("Es gibt noch keine Kunden.");
            return;
        }
        if (kanaele.isEmpty()) {
            System.out.println("Es gibt noch keine Nachrichtenkanaele.");
            return;
        }
        int i = 1;
        System.out.println("Welcher Kunde? ");
        for (Kunde k : kunden)
            System.out.println(" (" + (i++) + ") " + k);
        Kunde kunde = kunden.get(nummerwaehlen(kunden.size()) - 1);
        Nachrichtenkanal nk = nachrichtenkanalWaehlen();
        kunde.addAbonnement(new Abonnement(nk, kunde,
                nummerwaehlen(10, "Zahlungsintervall")));
    }

    private void neuerNachrichtenkanal() {
        kanaele.add(new Nachrichtenkanal(
                textEingeben("Bezeichnung des Nachrichtenkanals: "),
                textEingeben("Inhalt des Nachrichtenkanals: "),
                nummerwaehlen(MAX_COST, "Preis")));
    }

    private void neuerKunde() {
        kunden.add(new Kunde(
                textEingeben("Name des Kunden: "),
                nummerwaehlen(MAX_CAPITAL, "Kapital")));
    }

    public static void main(String[] args) {
        new Main().dialog();
    }

}
