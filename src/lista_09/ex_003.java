package lista_09;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        teclado.close();

        String[] palavras = frase.split(" ");

        Map<String, Integer> ocorrencias = new HashMap<>();

        for (String p : palavras) {

            p = p.toLowerCase();

            if (ocorrencias.containsKey(p)) {
                ocorrencias.put(p, ocorrencias.get(p) + 1);
            }
            else {
                ocorrencias.put(p, 1);
            }
        }

        System.out.println("\nOcorrências de cada palavra:\n");

        for (String palavra : ocorrencias.keySet()) {
            System.out.println(palavra + " = " + ocorrencias.get(palavra));
        }
    }
}
