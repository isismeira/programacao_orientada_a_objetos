package lista_02;
import java.util.Scanner;

public class ex_006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Digite nome, preço e a quantidade do produto (para sair digite 'x'):  ");

            System.out.print("Nome: ");
            String nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("x")) { // Comparação com string
                break;
            }

            System.out.print("Preço: ");
            double preco = teclado.nextDouble();

            System.out.print("Quantidade: ");
            int qtdd = teclado.nextInt();

            teclado.nextLine(); // Para limpar o buffer do teclado

            if (qtdd < 11) {
                System.out.println(nome + ": " + ((float)(preco * qtdd)) + "$");
            } else if (qtdd < 21) {
                System.out.println(nome + ": " + ((float)(preco * qtdd))*(0.9) + "$"); 
            } else if (qtdd < 51) {
                System.out.println(nome + ": " + ((float)(preco * qtdd))*(0.8) + "$"); 
            } else {
                System.out.println(nome + ": " + ((float)(preco * qtdd))*(0.75) + "$"); 
            }
        }
        teclado.close();
    }
}
