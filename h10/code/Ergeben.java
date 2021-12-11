class Ergeben implements State {
    private final Context_Politiker context;

    public Ergeben(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "PROTEGIERT ERGEBEN";
    }

    public void parteilob() {
    }

    public void parteitadel() {
    }

    public void wirtschaftslob() {
        context.setWirtschaftState(context.getHoerig());
    }

    public void wirtschaftskritik() {
        context.setWirtschaftState(context.getNeutral());
    }

    public void erwischt() {
        context.setParteiState(context.getRuhestand());
        context.setWirtschaftState(context.getRuhestand());
    }

}