package lista_05.ex_003;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean ativo;

    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.ativo = false;
    }

    public boolean realizarEmprestimo() {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            this.ativo = true;
            return true;
        }
        return false;
    }

    public boolean devolverLivro() {
        if (ativo) {
            livro.setDisponivel(true);
            this.ativo = false;
            return true;
        }
        return false;
    }

    public boolean estaAtrasado() {
        if (ativo) {
            return LocalDate.now().isAfter(dataDevolucao);
        }
        return false;
    }

    // Getters
    public Livro getLivro() {
        return livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // Setters
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}