package lista_01;
import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual seu nome?: "); // print() escreve o conteúdo na mesma linha, println() pula após escrever o conteúdo
        nome = teclado.next();
        System.out.println("Olá, " + nome +"! Bem-vindo ao Java!");
        teclado.close();
    }
}
