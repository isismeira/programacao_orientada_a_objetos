package lista_06.ex_004;

public class Retangulo {
    private double x;
    private double y;
    private double largura;
    private double altura;

    public Retangulo(double x, double y, double largura, double altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void mover(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    public void redimensionar(double novaLargura, double novaAltura) {
        this.largura = novaLargura;
        this.altura = novaAltura;
    }

    public void exibirInfo() {
        System.out.println("Retângulo:");
        System.out.println("Posição: (" + x + ", " + y + ")");
        System.out.println("Dimensões: " + largura + " x " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}