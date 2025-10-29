package lista_05.ex_001;
// ...cada item especifica o produto que o cliente deseja e a respectiva quantidade.

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        setQuantidade(quantidade);
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public boolean processarItem() {
        return produto.reduzirEstoque(quantidade);
    }

    // Getters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setter
    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 1;
        }
    }

    // Checar disponibilidade de estoque
    public boolean disponibilidade() {
        return quantidade <= produto.getQuantidadeEstoque();
    }
}
