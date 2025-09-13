package lista_02;

import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        int t = teclado.nextInt();
        int horas = t/360;
        int minutos = (t%360)/60;
        int segundos = (t%360)%60;
        System.out.println("São " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        teclado.close();
    }
}
