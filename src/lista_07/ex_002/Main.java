package lista_07.ex_002;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = {
            new Homem(),
            new Cao(),
            new Gato(),
            new Gato(),
            new Homem()
        };

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Animal " + i + ": " + animais[i].fala());
        }

        Animal teste = new Homem();
        System.out.println("Outro teste -> " + teste.fala());
    }
}