package lista_02;

import java.util.Scanner;

public class ex_002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da variável a: ");
        float a = teclado.nextFloat();
        System.out.print("Digite o valor da variável b: ");
        float b = teclado.nextFloat();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        teclado.close();
    }    
}
