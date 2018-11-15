import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Schueler schueler;
        Student student;

        Person[] personenListe = new Person[1000];
        int personenAnzahl = 0;

        int auswahl;

        do {
            System.out.println("\n\n1- Eingabe eines Schülers");
            System.out.println("2- Eingabe eines Studenten");
            System.out.println("3- Ausgabe der Liste am Bildschirm");
            System.out.println("4- Ausgabe aller Schüler am Bildschirm");
            System.out.println("5- Ausgabe aller Studenten am Bildschirm");
            System.out.println("6- Ausgabe aller Studenten am Bildschirm\n");

            System.out.print("Wählen Sie eine Option: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    personenListe[personenAnzahl] = readSchueler();
                    personenAnzahl++;
                    break;
                case 2:
                    personenListe[personenAnzahl] = readStudent();
                    personenAnzahl++;
                    break;
                case 3:
                    printPersonen(personenListe, personenAnzahl);
                    break;
                case 4:
                    printSchueler(personenListe, personenAnzahl);
                    break;
                case 5:
                    printStudenten(personenListe, personenAnzahl);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }

        } while (auswahl != 6);
        System.out.println("Tschüss! Bis zum Nächsten mal!6");
    }

    private static void printStudenten(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Student) {
                System.out.println(personenListe[i] + "\n");
            }
        }
    }

    private static void printSchueler(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Schueler) {
                System.out.println(personenListe[i] + "\n");
            }
        }
    }

    private static void printPersonen(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Schueler) {
                System.out.println("Schüler: ");
            } else {
                System.out.println("Student: ");
            }
            System.out.println(personenListe[i] + "\n");

        }

    }

    private static Schueler readSchueler() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();

        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();

        System.out.print("Schule: ");
        String schule = scanner.nextLine();

        System.out.print("Klasse: ");
        String klasse = scanner.nextLine();

        System.out.print("Katalog Nr.: ");
        int katalogNr = scanner.nextInt();

        return new Schueler(vorname, nachname, klasse, schule, katalogNr);
    }

    private static Student readStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();

        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();

        System.out.print("Universität: ");
        String universitaet = scanner.nextLine();

        System.out.print("Studienfach: ");
        String studienfach = scanner.nextLine();

        System.out.print("Matrikel Nr.: ");
        int matrikelNr = scanner.nextInt();

        return new Student(vorname, nachname, universitaet, matrikelNr, studienfach);
    }
}