package lista_09;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        teclado.close();

        String[] palavras = frase.split(" ");

        List<String> lista = new ArrayList<>();

        for (String p : palavras) {
            lista.add(p);
        }

        System.out.println("\nFrase invertida:");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }

        System.out.println();
    }
}
