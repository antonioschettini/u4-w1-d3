package esercizio1;

import esercizio1.entities.Rettangolo;

public class GestioneRettangoli {
    static void main(String[] args) {
        System.out.println("Esercizio 1--- Gestione Rettangoli");
        System.out.println("------");
        // Creo due rettangoli
        Rettangolo rettangolo1 = new Rettangolo(7.5, 12.5);
        Rettangolo rettangolo2 = new Rettangolo(10.0, 17.2);
//        // Quesito 1 Stampo i due rettangoli
//        stampaRettangolo(rettangolo1);
//        stampaRettangolo(rettangolo2);
        // Quesito 2 Stampo 2 due rettangoli e ne sommo area ed perimetro
        stampaRettangoliSomma(rettangolo1, rettangolo2);
    }

    // -----Lista Metodi
    // Stampa del singolo rettangolo
    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Dati del rettangolo --- Lunghezza: " + rettangolo.getLunghezza() + "---- Altezza: " + rettangolo.getAltezza());
        System.out.println("Area del rettangolo --- Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo --- Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("------");
    }

    // Stampo due rettangoli e li sommo
    public static void stampaRettangoliSomma(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Primo Rettangolo");
        stampaRettangolo(rettangolo1);
        System.out.println("Secondo Rettangolo");
        stampaRettangolo(rettangolo2);

        // Calcolo la somma dei perimetri ed Aree
        double sommaArea = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetro = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        // Stampe in console dei risultati
        System.out.println("La somma dei due rettangoli di area e perimetro è: ");
        System.out.println("Somma delle Aree: " + sommaArea);
        System.out.println("Somma dei perimetri: " + sommaPerimetro);
    }
}
