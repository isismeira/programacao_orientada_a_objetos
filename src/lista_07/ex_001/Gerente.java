package lista_07.ex_001;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, String senha, String matricula, String setor) {
        super(nome, senha, matricula);
        this.setor = setor;
    }

    public void fecharCaixa() {
        System.out.println("Gerente " + getNome() + " fechou o caixa");
    }

    public void gerarRelatorio() {
        System.out.println("Gerente " + getNome() + " gerou um relatório");
    }

    public void gerenciarFuncionarios() {
        System.out.println("Gerente " + getNome() + " está gerenciando funcionários");
    }

    // Getters
    public String getSetor() {
        return setor;
    }

    // Setters
    public void setSetor(String setor) {
        this.setor = setor;
    }
}