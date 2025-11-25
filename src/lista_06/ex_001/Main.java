package lista_06.ex_001;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(0);
        int opcao = 0;
        while(opcao != 6) {
            System.out.println("Estado da memória: " + calculadora.getValorMemoria());
            System.out.println("Opções: ");
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Limpar memória");
            System.out.println("(6) Sair do programa");
            System.out.print("Qual opção você deseja?: ");
            opcao = teclado.nextInt();
            System.out.println();
            System.out.print("Digite o valor a ser realizado a operação: ");
            double valor = teclado.nextDouble();
            if (opcao == 1) {
                calculadora.somar(valor);
            } else if (opcao == 2) {
                calculadora.subtrair(valor);
            } else if (opcao == 3) {
                calculadora.multiplicacar(valor);
            } else if (opcao == 4) {
                calculadora.dividir(valor);
            } else if (opcao == 5) {
                calculadora.limparMemoria();
            } else {
                System.out.println("Você inseriu uma opção não válida");
            }
        }
        teclado.close();         
    }
}
