public class Student extends Person{

    private String universitaet;
    private int matrikelNr;
    private String studienfach;

    public Student(){
        super();
    }

    public Student(String vorname, String nachname, String universitaet, int matrikelNr, String studienfach){
        super(vorname, nachname);
        this.universitaet = universitaet;
        this.matrikelNr = matrikelNr;
        this.studienfach = studienfach;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\n");
        sb.append("Universität: ");
        sb.append(universitaet);
        sb.append("\n");
        sb.append("Matrikelnummer: ");
        sb.append(matrikelNr);
        sb.append("\n");
        sb.append("Studienfach: ");
        sb.append(studienfach);

        return sb.toString();
    }
}