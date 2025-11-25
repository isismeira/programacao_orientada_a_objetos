package lista_07.ex_004;

public class Main {
    public static void main(String[] args) {

        ContaComum comum = new ContaComum(1001, 1000.00);
        comum.depositar(200);
        comum.sacar(150);
        System.out.println("Conta comum saldo: " + comum.consultarSaldo());

        ContaPoupanca poupanca = new ContaPoupanca(2001, 500.00, 0.5);
        poupanca.render();
        System.out.println("Conta poupança saldo: " + poupanca.consultarSaldo());

        ContaEspecial especial = new ContaEspecial(3001, 300.00, 200.00);
        especial.sacar(400);
        System.out.println("Conta especial saldo: " + especial.consultarSaldo());
        System.out.println("Disponível com limite: " + especial.consultarSaldoDisponivel());

        Conta[] contas = { comum, poupanca, especial };
        for (Conta conta : contas) {
            conta.depositar(50);
            System.out.println("Conta " + conta.getNumero() + " agora tem " + conta.consultarSaldo());
        }
    }
}