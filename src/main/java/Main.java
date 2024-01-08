public class Main {
    public static void main(String[] args) {
        Carbon carbonRahmen = new Carbon("Rot");
        Felgen felgenbremse = new Felgen();
        Kettenschaltung kettenschaltung = new Kettenschaltung();

        Rennrad rotesRennrad = new Rennrad("Rotes Rennrad", carbonRahmen, felgenbremse, kettenschaltung);
        rotesRennrad.printDescription();

        Alu aluRahmen = new Alu("Schwarz");
        Scheiben scheibenbremse = new Scheiben();
        Kettenschaltung ketteSchaltung = new Kettenschaltung();

        EMountainbike schwarzesEMTB = new EMountainbike("Schwarzes E-Mountainbike", aluRahmen, scheibenbremse, ketteSchaltung);
        schwarzesEMTB.printDescription();

        Alu aluRahmenWeiss = new Alu("Weiß");
        Trommel trommelbremse = new Trommel();
        Nabenschaltung nabenschaltung = new Nabenschaltung();

        EStadtfahrrad weißesEStadtfahrrad = new EStadtfahrrad("Weißes E-Stadtfahrrad", aluRahmenWeiss, trommelbremse, nabenschaltung);
        weißesEStadtfahrrad.printDescription();
    }
}
