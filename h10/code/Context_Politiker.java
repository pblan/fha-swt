public class Context_Politiker {
    // member
    private State parteiState;
    private State wirtschaftState;

    // setter
    public void setParteiState(State parteiState) {
        this.parteiState = parteiState;
    }

    public void setWirtschaftState(State wirtschaftState) {
        this.wirtschaftState = wirtschaftState;
    }

    // aktiv
    public boolean aktiv() {
        // parteiState = ruhestand <=> wirtschaftState = ruhestand
        return this.parteiState != this.ruhestand;
    }

    // 'politisch aktiv' states
    // --> 'partei' states
    private State rebellisch;
    private State loyal;
    private State kriechend;

    public State getRebellisch() {
        return this.rebellisch;
    }

    public State getLoyal() {
        return this.loyal;
    }

    public State getKriechend() {
        return this.kriechend;
    }

    // --> 'wirtschaft' states
    private State hoerig;
    private State ergeben;
    private State rehabilitiert;
    private State neutral;

    public State getHoerig() {
        return this.hoerig;
    }

    public State getErgeben() {
        return this.ergeben;
    }

    public State getRehabilitiert() {
        return this.rehabilitiert;
    }

    public State getNeutral() {
        return this.neutral;
    }

    // nicht-'politisch aktiv' states
    private State aufsichtsrat;
    private State ruhestand;

    public State getRuhestand() {
        return this.ruhestand;
    }

    public State getAufsichtsrat() {
        return this.aufsichtsrat;
    }

    // ereignisse
    public void parteilob() {
        parteiState.parteilob();
    }

    public void parteitadel() {
        parteiState.parteitadel();
    }

    public void wirtschaftslob() {
        wirtschaftState.wirtschaftslob();
    }

    public void wirtschaftskritik() {
        wirtschaftState.wirtschaftskritik();
    }

    public void erwischt() {
        parteiState.erwischt();
        wirtschaftState.erwischt(); // redundant
    }

    @Override
    public String toString() {
        // parteiState = ruhestand <=> wirtschaftState = ruhestand
        if (parteiState == this.ruhestand)
            return parteiState.toString();
        return parteiState.toString() + " " + wirtschaftState.toString();
    }

    public Context_Politiker() {
        this.rebellisch = new Rebellisch(this);
        this.loyal = new Loyal(this);
        this.kriechend = new Kriechend(this);

        this.hoerig = new Hoerig(this);
        this.ergeben = new Ergeben(this);
        this.rehabilitiert = new Rehabilitiert(this);
        this.neutral = new Neutral(this);

        this.aufsichtsrat = new Aufsichtsrat(this);
        this.ruhestand = new Ruhestand(this);

        this.parteiState = this.loyal;
        this.wirtschaftState = this.ergeben;
    }
}
