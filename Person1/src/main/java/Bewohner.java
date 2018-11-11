public class Bewohner {

    private String vorname;
    private String nachname;

    //region Getter & Setter
    String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    //endregion

    public Bewohner() {}

    Bewohner(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
}