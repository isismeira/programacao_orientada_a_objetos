package lista_06.ex_005;

public class Circulo {
    private double x;
    private double y;
    private double raio;

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public void mover(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    public void redimensionar(double novoRaio) {
        this.raio = novoRaio;
    }

    public void exibirInfo() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + x + ", " + y + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + calcularDiametro());
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}