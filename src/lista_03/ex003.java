package lista_03;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String s = teclado.nextLine();
        System.out.println("Número total de caracteres: " + s.length());
        System.out.println("Em maiúsculo: " + s.toUpperCase());
        System.out.println("Em minúsculo: " + s.toLowerCase());
        int count = 0;
        String s_low = s.toLowerCase();
        for (int i = 0; i < s_low.length(); i++) {
            if  (  s.charAt(i) == 'a'  ) {
                count++;
            }
        }
        System.out.println("A letra 'A' aparece " + count + " vezes");
        teclado.close();
    }
}