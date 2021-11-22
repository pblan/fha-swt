public abstract class Person {
    protected String name;
    protected Personalausweis personalausweis = new Personalausweis(); // unique

    public Person(String name, Personalausweis personalausweis) {
        this.name = name;
        this.personalausweis = personalausweis;
        personalausweis.setPerson(this);
    }

    public String getName() {
        return name;
    }
}