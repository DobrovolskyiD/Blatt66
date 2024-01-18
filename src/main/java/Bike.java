public abstract class Bike {
    private String name;
    private Rahmen rahmen;
    private Bremse bremse;
    private Schaltung schaltung;
    private Reifen reifen;

    public Bike(String name, Rahmen rahmen, Bremse bremse, Schaltung schaltung,Reifen reifen) {
        this.name = name;
        this.rahmen = rahmen;
        this.bremse = bremse;
        this.schaltung = schaltung;
        this.reifen = reifen;
    }


    public void printDescription() {
        System.out.println("Fahrrad: " + name);
        System.out.println("Komponenten:");
        System.out.println("- Rahmen: " + rahmen);
        System.out.println("- Bremse: " + bremse);
        System.out.println("- Schaltung: " + schaltung);
        System.out.println("- Reifen: " + reifen);
    }


    public String toString() {
        return name + " " + rahmen + ", " + bremse + ", " + schaltung;
    }
}

