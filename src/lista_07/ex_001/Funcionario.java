package lista_07.ex_001;

public class Funcionario extends Usuario {
    private String matricula;

    public Funcionario(String nome, String senha, String matricula) {
        super(nome, senha);
        this.matricula = matricula;
    }

    public void realizarVenda() {
        System.out.println("Funcionário " + getNome() + " realizou uma venda");
    }

    public void consultarEstoque() {
        System.out.println("Funcionário " + getNome() + " consultou o estoque");
    }

    public void atenderCliente() {
        System.out.println("Funcionário " + getNome() + " está atendendo um cliente");
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}