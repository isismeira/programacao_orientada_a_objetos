package lista_10;

public class ex_003 {
    public static void main(String[] args) {

        System.out.println("Diferença entre sleep() e join():");
        System.out.println();

        System.out.println("sleep(ms):");
        System.out.println("- Faz a thread atual dormir por um tempo");
        System.out.println("- Não espera outra thread");
        System.out.println("- Apenas pausa a própria execução");

        System.out.println();

        System.out.println("join():");
        System.out.println("- Faz a thread atual esperar outra thread terminar");
        System.out.println("- É sincronização entre threads");
        System.out.println("- Muito usado quando uma thread depende dos resultados de outra");
    }
}
