package lista_05.ex_004;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(1000.00);
        System.out.println("Saldo inicial: " + conta.obterSaldo());

        conta.depositar(250.00);
        conta.depositar(50.00);
        System.out.println("Depois de dois depósitos: " + conta.obterSaldo());

        conta.sacar(300.00);
        System.out.println("Depois do saque de 300: " + conta.obterSaldo());

        boolean saqueGrande = conta.sacar(2000.00);
        System.out.println("Tentei sacar 2000 -> " + saqueGrande);
        System.out.println("Saldo agora: " + conta.obterSaldo());

        ContaCorrente conta2 = new ContaCorrente(120.00);
        double valorLimite = conta2.obterSaldo() - ContaCorrente.getTaxaOperacao();
        conta2.sacar(valorLimite);
        System.out.println("Conta 2 ficou com: " + conta2.obterSaldo());
    }
}