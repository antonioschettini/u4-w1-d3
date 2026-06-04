package esercizio2;

import esercizio2.entities.Chiamata;
import esercizio2.entities.Sim;

public class GestioneTelefonia {
    static void main(String[] args) {
        System.out.println("Gestione telefonia");

        // creo una sim
        Sim sim1 = new Sim("349-6037777");

        // Ne stampo i dettagli
        System.out.println("Verifica della Sim");
        sim1.stampaDettagliSim();

        // Elecondo di 5 chiamate
        Chiamata[] registroSim1 = {
                new Chiamata(1, "3496022587"),
                new Chiamata(10, "3405321454"),
                new Chiamata(7, "33965424136"),
                new Chiamata(50, "3442323235"),
                new Chiamata(17, "3208583659"),
        };

        // imposto l'array appena creato nel registro chiamate
        sim1.setListaChiamate(registroSim1);

        // ristampo la sim per verificare che tutto sia ok
        System.out.println("Verifica della Sim");
        sim1.stampaDettagliSim();
    }
}
