package lista_09;import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_002 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        teclado.close();

        String[] palavras = frase.split(" ");

        Set<String> conjunto = new HashSet<>();

        for (String p : palavras) {
            conjunto.add(p.toLowerCase());
        }

        System.out.println("\nNúmero de palavras não repetidas: " + conjunto.size());
    }
}
