package lista_04;
import java.util.Scanner;

public class ex_002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de elementos no vetor: ");
        int n = teclado.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i+1) + " no vetor: ");
            int valor = teclado.nextInt();
            v[i] = valor;
        }
        System.out.print("Digite um número k: ");
        int k = teclado.nextInt();
        boolean tem_k = false;
        for (int i = 0; i < n; i++) {
            if ( v[i] == k) {
                tem_k = true;
                System.out.println(k + " aparece no índice " + i);
            }
            
        }
        if (tem_k == false) {
            System.out.println("Número não encontrado");
        }
        teclado.close();
    }    
}
