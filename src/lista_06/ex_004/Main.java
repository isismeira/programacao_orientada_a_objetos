package lista_06.ex_004;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 3, 4, 5);
        retangulo.exibirInfo();
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        retangulo.mover(10, 10);
        retangulo.redimensionar(8, 1.5);
        System.out.println("Depois de mover e redimensionar:");
        retangulo.exibirInfo();

        Retangulo outro = new Retangulo(0, 0, 2, 2);
        System.out.println("Outro retângulo área: " + outro.calcularArea());
        System.out.println("Retângulo maior? " + (retangulo.calcularArea() > outro.calcularArea()));
    }
}