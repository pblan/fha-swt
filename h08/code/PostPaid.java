public class PostPaid implements IAbrechnungsart {
    private Abonnement abo;
    private int gesendet = 0;
    private int intervall = 3; // default

    public PostPaid(Abonnement abo) {
        this.abo = abo;
    }

    public void setIntervall(int intervall) {
        this.intervall = intervall;
    }

    public void bezahlen() {
        gesendet = (gesendet + 1) % intervall;
        if (gesendet == 0) {
            int preis = abo.getObserver().getKanal().getPreis();
            String name = abo.getKunde().getName();
            System.out.println(
                    "PostPaid: " + name + ": " + preis * intervall + " Euro");
            if (this.abo.getKunde().bezahlen(preis * intervall)) {
                this.abo.addBezahlt(preis * intervall);
                System.out.println("PostPaid: " + name + ": Bezahlt!");
            } else {
                System.out.println("PostPaid: " + name + ": Konnte nicht zahlen!");
                // sorry leude aber ich hab keine lust mehr
                this.abo.getKunde().removeAbonnement(this.abo);
                this.abo.getObserver().getKanal()
                        .removeObserver(this.abo.getObserver());
                System.out.println("PostPaid: " + name + ": Abonnement beendet!");
            }

        }

    }
}
