package lista_04;
import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de elementos no vetor: ");
        int n = teclado.nextInt();
        int v[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i+1) + " do vetor: ");
            v[i] = teclado.nextInt();
        }
        
        System.out.print("Digite um número k: ");
        int k = teclado.nextInt();
        System.out.print("Digite uma posição p: ");
        int p = teclado.nextInt();
        
        if (p < 0 || p >= n) {
            System.out.println("Posição inválida");
        } else {
            for (int j = n - 1; j > p; j--) {
                v[j] = v[j - 1];
            }
            v[p] = k;
            
            System.out.println("Vetor após a inserção:");
            for (int i = 0; i < n; i++) {
                System.out.println(v[i]);
            }
        }
        teclado.close();
    }        
}