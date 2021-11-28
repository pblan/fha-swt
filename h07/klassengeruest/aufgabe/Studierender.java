public class Studierender extends Person implements Comparable<Studierender> {

    private String studienfach;
    private int semester;

    public Studierender(String name, String studienfach, int semester) {
        super(name, new Personalausweis());
        this.studienfach = studienfach;
        this.semester = semester;
    }

    @Override
    public int compareTo(Studierender studierender) {
        assert studierender != null;

        return this.studienfach.compareTo(studierender.studienfach);
    }

    public String getStudienfach() {
        return studienfach;
    }

    public void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Studierender{" +
                "name='" + getName() + '\'' +
                ", studienfach='" + studienfach + '\'' +
                ", semester=" + semester +
                '}';
    }

    public void benachrichtige(Buch buch) {
        // whatever
    }
}
