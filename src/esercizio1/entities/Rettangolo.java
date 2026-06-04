package esercizio1.entities;

public class Rettangolo {
    // ------Lista Attributi
    // Attributi Privati
    private double altezza;
    private double lunghezza;

    // ----- Lista Costruttori
    public Rettangolo(double altezza, double lunghezza) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    //------Lista Metodi
    // Calcolare l'area
    public double calcolaArea() {
        return altezza * lunghezza;
    }

    // Calcolare il perimetro
    public double calcolaPerimetro() {
        return (altezza + lunghezza) * 2;
    }

    // ----------Getter e Setter (per accedere ai dati privati al di fuori dell'istanza della classe)
    public double getAltezza() {
        return altezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", lunghezza=" + lunghezza +
                '}';
    }
}
