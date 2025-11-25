package lista_05.ex_003;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa ana = new Pessoa("Ana Costa", "123.456.789-00", "Rua A, 100");
        Pessoa bruno = new Pessoa("Bruno Lima", "987.654.321-00", "Rua B, 200");

        Livro cleanCode = new Livro("Clean Code", "Robert C. Martin", "978-0132350884");
        Livro designPatterns = new Livro("Design Patterns", "Gang of Four", "978-0201633610");

        LocalDate hoje = LocalDate.now();
        Emprestimo emprestimoAna = new Emprestimo(cleanCode, ana, hoje, hoje.plusDays(7));
        Emprestimo emprestimoBruno = new Emprestimo(designPatterns, bruno, hoje, hoje.plusDays(5));

        System.out.println("Ana pegou " + cleanCode.getTitulo() + ": " + emprestimoAna.realizarEmprestimo());
        System.out.println("Bruno pegou " + designPatterns.getTitulo() + ": " + emprestimoBruno.realizarEmprestimo());

        Emprestimo disputa = new Emprestimo(cleanCode, bruno, hoje, hoje.plusDays(2));
        System.out.println("Bruno tentando o mesmo livro: " + disputa.realizarEmprestimo());

        System.out.println("Livro 1 disponível? " + cleanCode.isDisponivel());
        emprestimoAna.devolverLivro();
        System.out.println("Livro 1 disponível depois da devolução? " + cleanCode.isDisponivel());
        System.out.println("Empréstimo atrasado? " + emprestimoBruno.estaAtrasado());
    }
}