package lista_06.ex_003;

public class Main {
    public static void main(String[] args) {
        testar(73);
        testar(3661);
        testar(59);
        testar(86400);
    }

    private static void testar(int segundos) {
        ConversorTempo conversor = new ConversorTempo(segundos);
        System.out.print(segundos + "s -> ");
        conversor.exibirTempo();
        System.out.println(" horas=" + conversor.obterHoras() + " minutos=" + conversor.obterMinutos() + " segundos=" + conversor.obterSegundos());
    }
}