import java.util.ArrayDeque;

public class Buch implements Comparable<Buch> {
    private String bezeichnung;
    private ArrayDeque<Studierender> warteliste = new ArrayDeque<>();
    private boolean blocked = false;

    public Buch(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    @Override
    public int compareTo(Buch buch) {
        return this.bezeichnung.compareTo(buch.bezeichnung);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void ausleihen(Studierender ausleihender) {
        if (blocked)
            throw new ArithmeticException(
                "Buch gesperrt");
        if (warteliste.isEmpty()) {
            blocked = true;
            return;
        }
        if (warteliste.getFirst() == ausleihender)
            warteliste.pop();
        else
            throw new ArithmeticException(
                    "Buch vorgemerkt");
        blocked = true;
    }

    public void zurueckgeben() {
        blocked = false;
    }

    public void addWartender(Studierender wartender) {
        warteliste.offer(wartender);
    }
    
    public void benachrichtige() {
        if (warteliste.isEmpty())
            return;
        Studierender wartender = warteliste.getFirst();
        warteliste.pop();
        wartender.benachrichtige(this);
    }
}