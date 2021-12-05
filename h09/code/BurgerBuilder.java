class BurgerBuilder {
    int patties = 1;
    boolean cheese = false;
    boolean lettuce = false;
    boolean tomato = false;
    boolean pickle = false;
    boolean onion = false;
    boolean ketchup = false;

    public BurgerBuilder addPatty() {
        patties++;
        return this;
    }

    public BurgerBuilder addCheese() {
        cheese = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        tomato = true;
        return this;
    }

    public BurgerBuilder addPickle() {
        pickle = true;
        return this;
    }

    public BurgerBuilder addOnion() {
        onion = true;
        return this;
    }

    public BurgerBuilder addKetchup() {
        ketchup = true;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}