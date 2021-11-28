import java.util.ArrayList;
import java.util.Collections;

public class Studiengang {
    private String bezeichnung; // unique
    private ArrayList<Studierender> teilnehmende = new ArrayList<>(); // ordered

    public Studiengang(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void addTeilnehmender(Studierender teilnehmender) {
        teilnehmende.add(teilnehmender);
        // sort teilnehmende
        Collections.sort(teilnehmende);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Studiengang: " + bezeichnung + "\n");
        for (Studierender studierender : teilnehmende) {
            sb.append("\t" + studierender + "\n");
        }
        return sb.toString();
    }
}