package lista_06.ex_002;

public class Main {
    public static void main(String[] args) {

        Aluno aprovado = new Aluno("Isis Meira", 8.0, 7.5, 9.0);
        Aluno recuperacao = new Aluno("Maria Oliveira", 5.0, 4.5, 5.5);
        Aluno reprovado = new Aluno("João Santos", 2.0, 3.5, 3.0);

        imprimir(aprovado);
        imprimir(recuperacao);
        imprimir(reprovado);

        System.out.println("\nCasos limite");
        imprimir(new Aluno("Ana Costa", 6.0, 6.0, 6.0));
        imprimir(new Aluno("Pedro Lima", 4.0, 4.0, 4.0));
    }

    private static void imprimir(Aluno aluno) {
        double media = aluno.calcularMedia();
        System.out.println(aluno.getNome() + " -> média " + String.format("%.2f", media) + " | " + aluno.obterStatus());
    }
}