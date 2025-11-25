package lista_07.ex_001;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Silva", "senha123", "123.456.789-00", "(21) 99999-1111");
        Funcionario funcionario = new Funcionario("João Santos", "func456", "F001");
        Gerente gerente = new Gerente("Carlos Oliveira", "ger789", "G001", "Vendas");

        System.out.println("Cliente: " + cliente.getNome() + " / " + cliente.getCpf());
        funcionario.realizarVenda();
        funcionario.consultarEstoque();
        gerente.gerenciarFuncionarios();

        Usuario[] usuarios = {
            cliente,
            funcionario,
            gerente,
            new Cliente("Ana Costa", "senha789", "987.654.321-00", "(21) 98888-2222")
        };

        for (Usuario usuario : usuarios) {
            System.out.println("Usuário logado: " + usuario.getNome());
        }
    }
}