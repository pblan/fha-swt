class Burger {
    private int patties;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickle;
    private boolean onion;
    private boolean ketchup;

    public Burger(BurgerBuilder builder) {
        this.patties = builder.patties;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.pickle = builder.pickle;
        this.onion = builder.onion;
        this.ketchup = builder.ketchup;
    }
}