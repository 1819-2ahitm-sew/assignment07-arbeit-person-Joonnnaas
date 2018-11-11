public abstract class Person {

    private String vorname;
    private String nachname;

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

}