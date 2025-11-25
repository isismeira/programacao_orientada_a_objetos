package lista_10;

public class ex_002 {

    public static void main(String[] args) {

        System.out.println("O modificador synchronized serve para garantir");
        System.out.println("que apenas uma thread por vez execute um trecho");
        System.out.println("de código crítico, evitando condições de corrida.");
        System.out.println();

        System.out.println("Quando usar?");
        System.out.println("- Ao acessar ou modificar recursos COMPARTILHADOS entre threads.");
        System.out.println("- Ao evitar inconsistência de dados.");
        System.out.println();

        System.out.println("Por que não usar em todos os métodos?");
        System.out.println("- Sincronização deixa o programa mais lento.");
        System.out.println("- Threads podem ficar bloqueadas desnecessariamente.");
        System.out.println("- Só deve ser aplicado quando realmente existe recurso compartilhado");
    }
}
