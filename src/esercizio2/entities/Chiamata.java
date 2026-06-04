package esercizio2.entities;

public class Chiamata {
    // --- Attributi
    private int durataMinuti;
    private String numeroChiamato;

    //--- Costruttore
    public Chiamata(int durataMinuti, String numeroChiamato) {
        this.durataMinuti = durataMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    // ---Getter e Setter

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}
