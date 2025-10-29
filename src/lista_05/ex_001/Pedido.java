package lista_05.ex_001;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<ItemPedido> itens;
    public String metodoPagamento;

    public Pedido(String metodoPagamento) {
        this.itens = new ArrayList<>();
        this.metodoPagamento = metodoPagamento;
    }

    public boolean checarDisponibilidade(Pedido pedido) {
        for (ItemPedido item: itens) {
            if (item.disponibilidade(item) == false) {
                return false;
            }
        }
        return true;
    }

    public void mostraPedido(Pedido pedido) {
        if (pedido != null && checarDisponibilidade(pedido)==true) {
            double total = 0;
            for(ItemPedido item: itens) {
                System.out.println(item.getProduto().getNome() + " - " + item.getProduto().getPreco() + " - " + item.getQuantidade());
                double subtotal = (item.getProduto().getPreco()) * (item.getQuantidade());
                total += subtotal;
            }
            System.out.println("Total: " + total);
            System.out.println("Método de pagamento: " + metodoPagamento);
            atualizarEstoque(pedido);
        }
    }
    
    public void atualizarEstoque(Pedido pedido) {
        for (ItemPedido item: itens) {
            item.getProduto().reduzirEstoque(item.getQuantidade());
        }
    }
}
