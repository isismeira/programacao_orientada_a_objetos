package lista_06.ex_005;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2, 2, 3);
        circulo.exibirInfo();
        System.out.println("Área: " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", circulo.calcularPerimetro()));

        circulo.mover(0, 0);
        circulo.redimensionar(5);
        System.out.println("Depois de mover para a origem e mudar o raio:");
        circulo.exibirInfo();

        Circulo outro = new Circulo(10, -2, 1);
        System.out.println("Outro círculo: ");
        outro.exibirInfo();
        System.out.println("Primeiro é maior? " + (circulo.calcularArea() > outro.calcularArea()));
    }
}