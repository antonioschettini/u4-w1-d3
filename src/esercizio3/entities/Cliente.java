package esercizio3.entities;

public class Cliente {
    // ---Lista Attributi
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    // --- Lista Costruttore
    public Cliente(String codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    //--- Getter
    public String getNomeCognome() {
        return nomeCognome;
    }
}
