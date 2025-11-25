package lista_08;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int soma = 0;

        while (true) {
            try {
                System.out.print("Digite um número inteiro positivo (<=0 para parar): ");
                int valor = Integer.parseInt(teclado.nextLine());

                if (valor <= 0) {
                    break;
                }

                soma += valor;

            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar um número inteiro válido.\n");
            }
        }

        teclado.close();

        System.out.println("\nSomatório = " + soma);
    }
}
