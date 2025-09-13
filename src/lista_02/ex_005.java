package lista_02;
import java.util.Scanner;

public class ex_005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de ax: ");
        double ax = teclado.nextDouble();
        System.out.print("Digite o valor de ay: ");
        double ay = teclado.nextDouble();

        System.out.print("Digite o valor de bx: ");
        double bx = teclado.nextDouble();
        System.out.print("Digite o valor de by: ");
        double by = teclado.nextDouble();

        System.out.print("Digite o valor de cx: ");
        double cx = teclado.nextDouble();
        System.out.print("Digite o valor de cy: ");
        double cy = teclado.nextDouble();
        
        double dab = Math.sqrt(Math.pow((bx - ax),2) + Math.pow((by - ay),2));
        double dbc = Math.sqrt(Math.pow((cx - bx),2) + Math.pow((cy - by),2));
        double dca = Math.sqrt(Math.pow((ax - cx),2) + Math.pow((ay - cy),2));

        boolean lado_1 = (Math.abs(dbc - dca) < dab) && ((dbc + dca) > dab);
        boolean lado_2 = (Math.abs(dab - dca) < dbc) && ((dab + dca) > dbc);
        boolean lado_3 = (Math.abs(dab - dbc) < dca) && ((dab + dbc) > dca);

        if (lado_1 && lado_2 && lado_3) {
            System.out.println("É um triângulo");
            if (dab == dbc && dab == dca && dbc == dca) {
                System.out.println("É equilátero");
            } else if (dab == dbc || dab == dca || dbc == dca) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        teclado.close();
    }
}
