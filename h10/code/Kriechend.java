class Kriechend implements State {
    private final Context_Politiker context;

    public Kriechend(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "POLITISCH_AKTIV KRIECHEND";
    }

    public void parteilob() {
        context.wirtschaftskritik();
    }

    public void parteitadel() {
        context.setParteiState(context.getRebellisch());
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