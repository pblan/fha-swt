public class NachrichtenkanalObserver {
    private Abonnement abo;
    private Nachrichtenkanal kanal;

    public NachrichtenkanalObserver(Abonnement abo, Nachrichtenkanal kanal) {
        this.abo = abo;
        this.kanal = kanal;
        kanal.addObserver(this);
        System.out.println("NachrichtenkanalObserver erstellt");
    }

    public Abonnement getAbo() {
        return abo;
    }

    public void setAbo(Abonnement abo) {
        this.abo = abo;
    }

    public Nachrichtenkanal getKanal() {
        return kanal;
    }

    public void setKanal(Nachrichtenkanal kanal) {
        this.kanal = kanal;
    }

    public void update() {
        this.abo.update();
    }
}
