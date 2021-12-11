class Aufsichtsrat implements State {
    private final Context_Politiker context;

    public Aufsichtsrat(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "AUFSICHTSRAT";
    }

    public void parteilob() {
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