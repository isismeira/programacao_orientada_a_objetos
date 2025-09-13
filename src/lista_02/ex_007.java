package lista_02;
import java.util.Scanner;

public class ex_007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número n: ");
        int n = teclado.nextInt();
        System.out.println("Digite dois números A e B que formam um intervalo, com A sendo menor do que B: ");
        System.out.print("A: ");
        int a = teclado.nextInt();
        System.out.print("B: ");
        int b = teclado.nextInt();

        if (n < a) {
            System.out.println("N está antes do intervalo");
        } else if (n > a && n < b) {
            System.out.println("N está dentro do intervalo");
        } else {
            System.out.println("N está depois do intervalo");
        }
        teclado.close();
    }
}
