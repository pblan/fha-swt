class Ruhestand implements State {
    private final Context_Politiker context;

    public Ruhestand(Context_Politiker context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "RUHESTAND";
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
    }

}