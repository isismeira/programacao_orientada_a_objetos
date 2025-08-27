package lista_01;
import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {
        int valor;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de centavos");
        valor = teclado.nextInt();

        int real = 0;
        int cinquenta = 0;
        int vinteCinco = 0;
        int dez = 0;
        int cinco = 0;
        int um = 0;

        while (valor > 0) {
            if (valor >= 100) {
                valor = valor - 100;
                real++;
            } else if (valor >= 50) {
                valor = valor - 50;
                cinquenta++;
            } else if (valor >= 25){
                valor = valor - 25;
                vinteCinco++;
            } else if (valor >= 10) {
                valor = valor - 10;
                dez++;
            } else if (valor >= 5) {
                valor = valor - 5;
                cinco++;
            } else if (valor >= 1) {
                valor = valor - 1;
                um++;
            }
        }

        System.out.println(real + " moedas de um real, " + cinquenta + "moedas de 50 centavos, " + vinteCinco + " moedas de 25 centavos, " + dez + " moedas de 10 centavos," +  cinco + " moedas de 5 centavos " + um + "moedas de 1 centavo");

        teclado.close();
    }
}    