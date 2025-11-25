package lista_07.ex_004;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return false;
        }

        double saldoDisponivel = saldo + limite;
        
        if (saldoDisponivel >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso!");
            if (saldo < 0) {
                System.out.println("Você está usando R$" + String.format("%.2f", Math.abs(saldo)) + " do limite");
            }
            return true;
        } else {
            System.out.println("Saldo insuficiente! (Saldo + Limite disponível: R$" + String.format("%.2f", saldoDisponivel) + ")");
            return false;
        }
    }

    public double consultarSaldoDisponivel() {
        return saldo + limite;
    }

    // Getters
    public double getLimite() {
        return limite;
    }

    // Setters
    public void setLimite(double limite) {
        this.limite = limite;
    }
}