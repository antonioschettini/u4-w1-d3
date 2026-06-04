package esercizio3;

import esercizio3.entities.Articolo;
import esercizio3.entities.Carrello;
import esercizio3.entities.Cliente;

public class GestioneEcommerce {
    static void main(String[] args) {
        System.out.println("Simulazione ecommerce");

        // creo un cliente
        Cliente utente1 = new Cliente("01", "Riccardo Gulin", "riccardogulin@epicode.com", "10/10/2025");
        // creo articoli
        Articolo smartphone = new Articolo("ean-1212 ", "Samsung S24 Ultra", 999.99, 3);
        Articolo cover = new Articolo("ean-3212 ", "Cover S24 Ultra", 5.99, 51);
        Articolo auricolari = new Articolo("ean-45452 ", "Samsung Galaxy Buds 3", 150.00, 7);
        // preparo l'array da inserire nel carrello
        Articolo[] articoliScelti = {smartphone, cover, auricolari};
        // imserisco nel carrello
        Carrello carrelloutente1 = new Carrello(utente1, articoliScelti);
        // stampo il resoconto e scontrino
        carrelloutente1.riepilogoScontrino();
    }
}
