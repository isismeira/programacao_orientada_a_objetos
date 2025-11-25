package lista_10;
import java.util.Scanner;

class ContadorPrimos implements Runnable {
    private int inicio;
    private int fim;
    private int qtdPrimos = 0;

    public ContadorPrimos(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    private boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int getQtdPrimos() {
        return qtdPrimos;
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                qtdPrimos++;
            }
        }
    }
}

public class ex_001 {

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = teclado.nextInt();
        teclado.close();

        int meio = n / 2;

        ContadorPrimos tarefa1 = new ContadorPrimos(0, meio);
        ContadorPrimos tarefa2 = new ContadorPrimos(meio + 1, n);

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int total = tarefa1.getQtdPrimos() + tarefa2.getQtdPrimos();

        System.out.println("Quantidade total de primos entre 0 e " + n + ": " + total);
    }
}
