class Hoerig implements State {
    private final Context_Politiker context;

    public Hoerig(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "PROTEGIERT HOERIG";
    }

    public void parteilob() {
    }

    public void parteitadel() {
    }

    public void wirtschaftslob() {
        context.setWirtschaftState(context.getAufsichtsrat());
    }

    public void wirtschaftskritik() {
        context.setWirtschaftState(context.getNeutral());
    }

    public void erwischt() {
        context.setParteiState(context.getRuhestand());
        context.setWirtschaftState(context.getRuhestand());
    }

}