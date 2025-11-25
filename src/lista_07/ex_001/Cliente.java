package lista_07.ex_001;

public class Cliente extends Usuario {
    private String cpf;
    private String celular;

    public Cliente(String nome, String senha, String cpf, String celular) {
        super(nome,senha);
        this.cpf = cpf;
        this.celular = celular;
    }

    // Getters
    public String getCpf(){
        return cpf;
    }

    public String getCelular(){
        return celular;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
