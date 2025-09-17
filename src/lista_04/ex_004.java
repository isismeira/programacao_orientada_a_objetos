package lista_04;
import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[10];
        int idades[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1));
            nomes[i] = teclado.nextLine();
            System.out.print("Digite a idade da pessoa " + (i+1));
            idades[i] = teclado.nextInt();

            teclado.nextLine(); // Limpar o buffer
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (nomes[j].compareToIgnoreCase(nomes[j+1]) > 0) {
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = tempNome;

                    int tempIdade = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempIdade;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " " + idades[i]);
        }

         for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (idades[j] > idades[j+1]) {
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = tempNome;

                    int tempIdade = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempIdade;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " " + idades[i]);
        }

        teclado.close();
        
    }            
}
