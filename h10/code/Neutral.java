class Neutral implements State {
    private final Context_Politiker context;

    public Neutral(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "NEUTRAL";
    }

    public void parteilob() {
    }

    public void parteitadel() {
    }

    public void wirtschaftslob() {
        context.setWirtschaftState(context.getRehabilitiert());
    }

    public void wirtschaftskritik() {
        // context.setWirtschaftState(context.getKommunistisch());
    }

    public void erwischt() {
        context.setParteiState(context.getRuhestand());
        context.setWirtschaftState(context.getRuhestand());
    }

}