package lista_05.ex_001;

// O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque.

public class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para reduzir estoque
    public boolean reduzirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    // Método para aumentar estoque
    public boolean aumentarEstoque(int quantidade) {
        if (quantidade >= 0) {
            quantidadeEstoque += quantidade;
            return true;
        }
        return false;
    }
}
