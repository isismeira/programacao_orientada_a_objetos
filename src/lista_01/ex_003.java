package lista_01;
import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.print("O número " + num + " é par");
        } else {
            System.out.print("O número " + num + " é ímpar");
        }
        teclado.close();
    }
}
