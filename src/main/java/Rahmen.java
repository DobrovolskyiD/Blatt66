public class Rahmen {
    private String material;
    private String farbe;

    public Rahmen(String material, String farbe) {
        this.material = material;
        this.farbe = farbe;
    }


    public String toString() {
        return material + " Rahmen in " + farbe + " Farbe";
    }
}