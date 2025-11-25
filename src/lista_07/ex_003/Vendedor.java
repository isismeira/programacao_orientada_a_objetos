package lista_07.ex_003;

public class Vendedor extends Funcionario {
    private float percentualBonus;

    public Vendedor(String nome, float salarioBruto, float percentualBonus) {
        super(nome, salarioBruto);
        this.percentualBonus = percentualBonus;
    }

    private float calcularBonus() {
        return getSalarioBruto() * (percentualBonus / 100);
    }

    @Override
    public float salarioLiquido() {
        float salarioComBonus = getSalarioBruto() + calcularBonus();
        float ir;
        
        if (salarioComBonus <= 900.00) {
            ir = 0;
        } else if (salarioComBonus <= 1500.00) {
            ir = salarioComBonus * 0.15f;
        } else {
            ir = salarioComBonus * 0.20f;
        }
        
        return salarioComBonus - ir;
    }

    // Getters
    public float getPercentualBonus() {
        return percentualBonus;
    }

    public float getBonus() {
        return calcularBonus();
    }

    // Setters
    public void setPercentualBonus(float percentualBonus) {
        this.percentualBonus = percentualBonus;
    }
}