package lista_07.ex_004;

public class ContaPoupanca extends Conta {
    private double percentualRendimento;

    public ContaPoupanca(int numero, double saldoInicial, double percentualRendimento) {
        super(numero, saldoInicial);
        this.percentualRendimento = percentualRendimento;
    }

    public void render() {
        double rendimento = saldo * (percentualRendimento / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$" + String.format("%.2f", rendimento) + " aplicado!");
        System.out.println("Novo saldo: R$" + String.format("%.2f", saldo));
    }

    // Getters
    public double getPercentualRendimento() {
        return percentualRendimento;
    }

    // Setters
    public void setPercentualRendimento(double percentualRendimento) {
        this.percentualRendimento = percentualRendimento;
    }
}