public abstract class Person {
    String vorname;
    String nachname;

    public Person(){}

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}