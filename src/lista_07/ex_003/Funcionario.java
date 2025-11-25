package lista_07.ex_003;

public class Funcionario {
    private String nome;
    private float salarioBruto;

    public Funcionario(String nome, float salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    protected float calcularIR() {
        if (salarioBruto <= 900.00) {
            return 0;
        } else if (salarioBruto <= 1500.00) {
            return salarioBruto * 0.15f;
        } else {
            return salarioBruto * 0.20f;
        }
    }

    public float salarioLiquido() {
        return salarioBruto - calcularIR();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}