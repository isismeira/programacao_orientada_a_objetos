package lista_06.ex_001;

public class Calculadora {
    private double valorMemoria;

    public Calculadora(double valorMemoria) {
        this.valorMemoria = valorMemoria;
    }

    // Getters
    public double getValorMemoria(){
        return valorMemoria;
    }

    // Setters
    public void setValorMemoria(double valorMemoria){
        this.valorMemoria = valorMemoria;
    }

    public void somar(double valor) {
        double soma = getValorMemoria() + valor;
        setValorMemoria(soma);
    }

    public void subtrair(double valor) {
        double subtracao = getValorMemoria() - valor;
        setValorMemoria(subtracao);
    }

    public void multiplicacar(double valor) {
        double multiplicacao = getValorMemoria() * valor;
        setValorMemoria(multiplicacao);
    }

    public void dividir(double valor) {
        double divisao = getValorMemoria() / valor;
        setValorMemoria(divisao);
    }
    
    public void limparMemoria() {
        setValorMemoria(0);
    }
}
