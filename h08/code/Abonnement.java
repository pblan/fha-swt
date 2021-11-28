public class Abonnement {
    private NachrichtenkanalObserver observer;
    private Kunde kunde;
    private IAbrechnungsart abrechnungsart = new PostPaid(this);
    private int bezahlt = 0;

    public Abonnement(Nachrichtenkanal kanal, Kunde kunde, int intervall) {
        this.observer = new NachrichtenkanalObserver(this, kanal);
        this.kunde = kunde;

        assert abrechnungsart instanceof PostPaid;
        ((PostPaid) abrechnungsart).setIntervall(intervall);

        System.out.println("Abonnement erstellt");
    }

    public NachrichtenkanalObserver getObserver() {
        return observer;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void addBezahlt(int bezahlt) {
        this.bezahlt += bezahlt;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "kunde=" + kunde.getName() +
                ", bezahlt=" + bezahlt +
                '}';
    }

    public void update() {
        System.out.println("Abonnement: " + this.kunde.getName()
                + " hat eine Nachricht erhalten");
        abrechnungsart.bezahlen();
        this.kunde.benachrichtige(
                this.observer.getKanal().getBezeichnung() + ": "
                        + this.observer.getKanal().getInhalt());
    }
}
