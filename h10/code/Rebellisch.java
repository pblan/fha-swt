class Rebellisch implements State {
    private final Context_Politiker context;

    public Rebellisch(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "POLITISCH_AKTIV REBELLISCH";
    }

    public void parteilob() {
        context.setParteiState(context.getLoyal());
    }

    public void parteitadel() {
    }

    public void wirtschaftslob() {
    }

    public void wirtschaftskritik() {
    }

    public void erwischt() {
        context.setParteiState(context.getRuhestand());
        context.setWirtschaftState(context.getRuhestand());
    }

}