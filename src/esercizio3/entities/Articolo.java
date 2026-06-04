package esercizio3.entities;

public class Articolo {
    // --- Lista Attributi
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzoArticolo;
    private int pezziDisponibiliMagazzino;

    // --- Costruttore
    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzoArticolo, int pezziDisponibiliMagazzino) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzoArticolo = prezzoArticolo;
        this.pezziDisponibiliMagazzino = pezziDisponibiliMagazzino;
    }

    // --- Getter
    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public double getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getPezziDisponibiliMagazzino() {
        return pezziDisponibiliMagazzino;
    }
}
