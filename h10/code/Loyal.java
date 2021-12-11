class Loyal implements State {
    private final Context_Politiker context;

    public Loyal(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "POLITISCH_AKTIV LOYAL";
    }

    public void parteilob() {
        context.setParteiState(context.getKriechend());
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