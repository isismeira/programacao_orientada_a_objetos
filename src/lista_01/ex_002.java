package lista_01;
import java.util.Scanner;

public class ex_002 {
    public static void main(String[] args) {
        int temperatura;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        temperatura = teclado.nextInt();
        int fahr = (int)((temperatura * 1.8) + 32);
        System.out.println(temperatura + "°C equivalem a " + fahr + "°F");
        teclado.close();
    }
}
