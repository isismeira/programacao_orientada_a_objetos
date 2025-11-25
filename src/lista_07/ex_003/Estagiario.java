package lista_07.ex_003;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, float salarioBruto) {
        super(nome, salarioBruto);
    }

    @Override
    protected float calcularIR() {
        return 0; 
    }
}