package esercizio2.entities;

public class Sim {
    // --- Lista Attributi
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate;

    //--Costruttori
    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0; // do un valore di default
        this.listaChiamate = new Chiamata[5]; // do un valore di default array di 5 elementi
    }

    //---Metodi
    // metodo per inserire un numero nell'array liste chiamate
    public void setListaChiamate(Chiamata[] nuoveChiamate) {
        if (nuoveChiamate != null && nuoveChiamate.length == 5) {
            this.listaChiamate = nuoveChiamate;
        } else {
            System.out.println("è possibile visualizzare solo le ultime 5 chiamate");
        }
    }

    // metodo per stampare i dati completi della sim
    public void stampaDettagliSim() {
        System.out.println("Dati della tua scheda Sim");
        System.out.println("Numero di telefono: " + this.numeroTelefono);
        System.out.println("Credito Disponibile: " + " €" + this.creditoDisponibile);
        System.out.println("Ultime 5 chiamate in registro: ");

        boolean chiamatePresenti = false;

        for (int i = 0; i < listaChiamate.length; i++) {
            if (listaChiamate[i] != null) {
                System.out.println((i + 1) + " Chiamata al: " + listaChiamate[i].getNumeroChiamato() + " Durata della chiamata: " + listaChiamate[i].getDurataMinuti() + " minuti");
                chiamatePresenti = true;
            }
        }
        if (!chiamatePresenti) {
            System.out.println("Nessuna chiamata è presente in registro");
        }
    }
}
