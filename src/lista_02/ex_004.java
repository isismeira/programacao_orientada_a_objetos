package lista_02;
import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Distância percorrida (km): ");
        int distancia = teclado.nextInt();
        System.out.print("Tempo gasto (h): ");
        int tempo = teclado.nextInt();
        System.out.print("Combustível consumido (L): ");
        int comb = teclado.nextInt();
        System.out.println("Velocidade: " + (distancia/tempo) + "km/h");
        System.out.println("Consumo: " + (distancia/comb) + "km/L");
        teclado.close();
    }
}
