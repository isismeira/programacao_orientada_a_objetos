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

    public boolean checarDisponibilidade() {
        for (ItemPedido item: itens) {
            if (item.disponibilidade() == false) {
                return false;
            }
        }
        return true;
    }

    public void mostrarPedido() {
        if (checarDisponibilidade()) {
            double total = 0;
            for (ItemPedido item : itens) {
                System.out.println(item.getProduto().getNome() + " - R$" + 
                    item.getProduto().getPreco() + " - " + item.getQuantidade() + 
                    " unidades - Subtotal: R$" + item.calcularSubtotal());
                total += item.calcularSubtotal();
                
                item.processarItem();
            }
            System.out.println("Total:" + total);
            System.out.println("Método de pagamento: " + metodoPagamento);
        } else {
            System.out.println("Itens sem estoque suficiente");
        }
    }

}
