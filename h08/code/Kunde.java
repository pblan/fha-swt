import java.util.*;

public class Kunde {
    private String name;
    private int kapital;
    private List<Abonnement> abonnements = new ArrayList<>();

    public Kunde(String name, int kapital) {
        this.name = name;
        this.kapital = kapital;
        System.out.println("Kunde " + name + " mit " + kapital + " Euro erzeugt.");
    }

    public String getName() {
        return name;
    }

    public int getKapital() {
        return kapital;
    }

    public void addAbonnement(Abonnement abo) {
        abonnements.add(abo);
    }

    public void removeAbonnement(Abonnement abo) {
        abonnements.remove(abo);
    }

    public boolean bezahlen(int betrag) {
        if (kapital >= betrag) {
            kapital -= betrag;
            return true;
        }
        return false;
    }

    public void benachrichtige(String text) {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", kapital=" + kapital +
                '}';
    }
}
