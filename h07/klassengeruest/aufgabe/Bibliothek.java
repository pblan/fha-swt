import java.util.ArrayList;
import java.util.Collections;

public class Bibliothek {
    private String bezeichnung; // unique
    private ArrayList<Buch> buecher = new ArrayList<Buch>();

    public Bibliothek(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void add(Buch buch) {
        buecher.add(buch);    
        Collections.sort(buecher);
    }
    
    public void ausleihen(Buch buch, Studierender studi) {
        buch.ausleihen(studi);
    }

    public void zurueckgeben(Buch buch) {
        buch.zurueckgeben();
        buch.benachrichtige();
    }

    public void addWartender(Buch buch, Studierender studi) {
        buch.addWartender(studi);
    }
}