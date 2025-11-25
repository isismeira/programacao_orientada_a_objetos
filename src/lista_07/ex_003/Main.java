package lista_07.ex_003;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João Silva", 1200.00f);
        Estagiario estagiario = new Estagiario("Ana Costa", 800.00f);
        Vendedor vendedor = new Vendedor("Carlos Lima", 1000.00f, 10.0f);

        imprimir(funcionario);
        imprimir(estagiario);
        imprimir(vendedor);

        System.out.println("Comparando somente salários líquidos:");
        System.out.println("Funcionario -> " + funcionario.salarioLiquido());
        System.out.println("Estagiario -> " + estagiario.salarioLiquido());
        System.out.println("Vendedor -> " + vendedor.salarioLiquido());
    }

    private static void imprimir(Funcionario funcionario) {
        System.out.println(funcionario.getNome() + ": bruto=" + funcionario.getSalarioBruto() + " | liquido=" + funcionario.salarioLiquido());
    }
}