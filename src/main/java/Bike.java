public class Bike {
    private String name;
    private Rahmen rahmen;
    private Bremse bremse;
    private Schaltung schaltung;

    public Bike(String name, Rahmen rahmen, Bremse bremse, Schaltung schaltung) {
        this.name = name;
        this.rahmen = rahmen;
        this.bremse = bremse;
        this.schaltung = schaltung;
    }


    public void printDescription() {
        System.out.println("Fahrrad: " + name);
        System.out.println("Komponenten:");
        System.out.println("- Rahmen: " + rahmen);
        System.out.println("- Bremse: " + bremse);
        System.out.println("- Schaltung: " + schaltung);
    }


    public String toString() {
        return name + " " + rahmen + ", " + bremse + ", " + schaltung;
    }
}

