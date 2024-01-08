public class Schaltung {
    private String typ;

    public Schaltung(String typ) {
        this.typ = typ;
    }



    @Override
    public String toString() {
        return typ + " Schaltung";
    }
}