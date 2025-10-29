package lista_05.ex_002;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }    
}    
