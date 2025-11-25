package lista_08;
import java.util.Scanner;

abstract class OperacaoMatematica {

    protected double a;
    protected double b;

    public OperacaoMatematica(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double calcular() throws Exception;

    public void executar() {
        try {
            double resultado = calcular();
            System.out.println("Resultado = " + resultado);
        } 
        catch (Exception e) {
            System.out.println("Erro ao realizar operação: " + e.getMessage());
        }
    }
}

class Soma extends OperacaoMatematica {
    public Soma(double a, double b) { super(a, b); }

    @Override
    public double calcular() {
        return a + b;
    }
}

class Divisao extends OperacaoMatematica {
    public Divisao(double a, double b) { super(a, b); }

    @Override
    public double calcular() throws Exception {
        if (b == 0) {
            throw new Exception("Divisão por zero não permitida");
        }
        return a / b;
    }
}

class Raiz extends OperacaoMatematica {
    public Raiz(double a) { super(a, 0); }

    @Override
    public double calcular() throws Exception {
        if (a < 0) {
            throw new Exception("Não é possível calcular raiz de número negativo");
        }
        return Math.sqrt(a);
    }
}

public class ex_002 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Divisão");
        System.out.println("3 - Raiz quadrada");

        System.out.print("Opção: ");
        int opcao = 0;

        try {
            opcao = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: opção inválida.");
            teclado.close();
            return;
        }

        double a = 0, b = 0;

        try {
            System.out.print("Digite o primeiro número: ");
            a = Double.parseDouble(teclado.nextLine());

            if (opcao == 1 || opcao == 2) {
                System.out.print("Digite o segundo número: ");
                b = Double.parseDouble(teclado.nextLine());
            }

        } catch (NumberFormatException e) {
            System.out.println("Número inválido digitado");
            teclado.close();
            return;
        }

        teclado.close();

        OperacaoMatematica op = null;

        switch (opcao) {
            case 1:
                op = new Soma(a, b);
                break;
            case 2:
                op = new Divisao(a, b);
                break;
            case 3:
                op = new Raiz(a);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        op.executar();
    }
}
