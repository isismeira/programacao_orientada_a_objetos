package lista_05.ex_001;

public class Main {
    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 20.50, 15);
        Produto feijao = new Produto("Feijão", 8.90, 8);
        Produto macarrao = new Produto("Macarrão", 4.50, 25);

        System.out.println("Estoque inicial do arroz: " + arroz.getQuantidadeEstoque());
        arroz.reduzirEstoque(4);
        System.out.println("Depois de vender 4: " + arroz.getQuantidadeEstoque());

        feijao.aumentarEstoque(2);
        System.out.println("Feijão atualizado: " + feijao.getQuantidadeEstoque());

        Pedido pedidoCartao = new Pedido("Cartão");
        pedidoCartao.itens.add(new ItemPedido(arroz, 3));
        pedidoCartao.itens.add(new ItemPedido(macarrao, 5));
        System.out.println("\nPedido no cartão:");
        pedidoCartao.mostrarPedido();

        Pedido pedidoDinheiro = new Pedido("Dinheiro");
        pedidoDinheiro.itens.add(new ItemPedido(feijao, 15));
        System.out.println("\nTentativa com estoque curto:");
        pedidoDinheiro.mostrarPedido();

        System.out.println("\nSaldo final:");
        System.out.println("Arroz -> " + arroz.getQuantidadeEstoque());
        System.out.println("Feijão -> " + feijao.getQuantidadeEstoque());
        System.out.println("Macarrão -> " + macarrao.getQuantidadeEstoque());
    }
}