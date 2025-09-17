package lista_04;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIgite o numero de alunos na turma: ");
        int n = teclado.nextInt();
        float[] notas = new float[n];
        float soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + i + ":");
            float nota = teclado.nextFloat();
            notas[i] = nota;
            soma += nota;
        }
        float media = soma / n;
        System.out.println("A média é: " + media);
        System.out.println("Notas acima da média: ");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }
        teclado.close();
    }
}
