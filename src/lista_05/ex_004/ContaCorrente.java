package lista_05.ex_004;

public class ContaCorrente {
    private double saldo;
    private static final double TAXA_OPERACAO = 1.50;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de R$" + quantia + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public boolean sacar(double quantia) {
        if (quantia <= 0) {
            System.out.println("Valor de saque inválido!");
            return false;
        }

        double valorTotal = quantia + TAXA_OPERACAO;
        
        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + quantia + " realizado com sucesso!");
            System.out.println("Taxa de operação: R$" + TAXA_OPERACAO);
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
            System.out.println("Valor necessário: R$" + valorTotal + " (saque + taxa)");
            return false;
        }
    }

    public double obterSaldo() {
        return saldo;
    }

    public static double getTaxaOperacao() {
        return TAXA_OPERACAO;
    }
}
