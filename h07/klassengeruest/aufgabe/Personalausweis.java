public class Personalausweis {
    private static int counter = 1;

    private int id; // unique
    private Person person;

    public Personalausweis() {
        // I solemnly swear that I'll add a Person
        this.id = getNewID();
    }

    private static int getNewID() {
        return counter++;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getID() {
        return id;
    }
}