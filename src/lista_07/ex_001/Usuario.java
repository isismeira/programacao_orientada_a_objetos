package lista_07.ex_001;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha; 
    }

    // Getters
    public String getNome(){
        return nome;
    } 

    public String getSenha() {
        return senha;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

}
