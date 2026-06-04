package esercizio3.entities;

public class Carrello {
    // -- Liata Attributi
    private Cliente clienteIscritto;
    private Articolo[] elencoArticoli;

    //--- Costruttore
    public Carrello(Cliente clienteIscritto, Articolo[] elencoArticoli) {
        this.clienteIscritto = clienteIscritto;
        this.elencoArticoli = elencoArticoli;
    }

    // --- Metodi
    // calcolo il costo totale degli articoli
    public double calcolaTotaleCostoArticoli() {
        double totale = 0;
        if (elencoArticoli != null) {
            for (int i = 0; i < elencoArticoli.length; i++) {
                totale += elencoArticoli[i].getPrezzoArticolo();
            }
        }
        return totale;
    }

    //stampo lo scontrino
    public void riepilogoScontrino() {
        System.out.println("Scontrino:");
        System.out.println("Carrello di: " + clienteIscritto.getNomeCognome());
        System.out.println("Articoli acquistati:");
        if (elencoArticoli == null || elencoArticoli.length == 0) {
            System.out.println("Non hai ancora acquistato nulla");
        } else {
            for (int i = 0; i < elencoArticoli.length; i++) {
                if (elencoArticoli[i] != null) {
                    System.out.println("--- " + elencoArticoli[i].getCodiceArticolo() + "Prezzo: " + elencoArticoli[i].getPrezzoArticolo() + "€");
                }
            }
        }
        System.out.println("----------");
        System.out.println("Totale da pagare: " + calcolaTotaleCostoArticoli() + " €");
        System.out.println("----------");
    }
}
