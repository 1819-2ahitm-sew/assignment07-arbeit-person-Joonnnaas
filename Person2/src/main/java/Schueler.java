public class Schueler extends Person {

    private String schule;
    private String klasse;
    private int katalogNr;

    public Schueler(){
        super();
    }

    public Schueler(String vorname, String nachname, String schule, String klasse, int katalogNr) {
        super(vorname, nachname);

        this.schule = schule;
        this.klasse = klasse;
        this.katalogNr = katalogNr;
    }

    @Override
    public String toString(){
        String help = super.toString();

        help += "\nSchule: " + schule;
        help += "\nKlasse:" + klasse;
        help += "\nKatalognummer: " + katalogNr;

        return help;
    }
}