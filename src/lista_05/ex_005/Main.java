package lista_05.ex_005;

public class Main {
    public static void main(String[] args) {

        Data dataBoa = new Data(15, 8, 2024);
        Data bissexta = new Data(29, 2, 2024);
        Data ruim = new Data(31, 4, 2024);

        System.out.print("Data boa: ");
        dataBoa.imprime();
        System.out.println(" válida? " + dataBoa.dataValida());

        System.out.print("Bissexta: ");
        bissexta.imprime("-");
        System.out.println(" ano bissexto? " + bissexta.anoBissexto());

        System.out.print("Data ruim: ");
        ruim.imprime();
        System.out.println(" válida? " + ruim.dataValida());

        Data testeSeparador = new Data(25, 12, 2024);
        System.out.print("Natal formatado: ");
        testeSeparador.imprime(" de ");
    }
}