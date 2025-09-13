package lista_02;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da variável a: ");
        a = teclado.nextInt();
        System.out.print("Digite o valor da variável b: ");
        b = teclado.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        teclado.close();
    }
}
