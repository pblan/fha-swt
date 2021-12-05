public class Test {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder()
                .addPatty()
                .addCheese()
                .addLettuce()
                .addTomato()
                .addPickle()
                .addOnion()
                .addKetchup()
                .build();

        System.out.println(burger);
    }
}
