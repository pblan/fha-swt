import java.util.*;

public class Nachrichtenkanal {
    private String bezeichnung;
    private String inhalt;
    private int preis;
    private ArrayList<NachrichtenkanalObserver> observers = new ArrayList<>();

    public Nachrichtenkanal(String bezeichnung, String inhalt, int preis) {
        this.bezeichnung = bezeichnung;
        this.inhalt = inhalt;
        this.preis = preis;
        System.out.println("Nachrichtenkanal " + bezeichnung
                + " mit Preis von " + preis + " Euro erzeugt.");
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getInhalt() {
        return inhalt;
    }

    public int getPreis() {
        return preis;
    }

    public ArrayList<NachrichtenkanalObserver> getObservers() {
        return observers;
    }

    public void addObserver(NachrichtenkanalObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NachrichtenkanalObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Nachrichtenkanal{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", inhalt='" + inhalt + '\'' +
                ", preis='" + preis + '\'' +
                ", abonnenten='" + observers.size() + '\'' +
                '}';
    }

    public void updateInhalt(String neuerInhalt) {
        this.inhalt = neuerInhalt;
        this.update();
    }

    public void update() {
        // temporaere Variable damit der Code in die Zeile passt
        var temp = (ArrayList<NachrichtenkanalObserver>) this.observers.clone();
        for (NachrichtenkanalObserver observer : temp) {
            observer.update();
        }
    }
}
