package aula_00_sintaxe_basica;

// Em Java, tudo precisa estar dentro de uma classe pública com o mesmo nome do arquivo.
public class Introducao {
    
    // Método principal: ponto de entrada do programa
    public static void main(String[] args) {
        System.out.println("=== Introdução ao Java ===\n");

        // ===== 1. Variáveis e tipos =====
        int idade = 20;
        double salario = 3500.75;
        boolean ativo = true;
        char letra = 'A';
        String nome = "Isis";
        String curso = "POO com Java";

        System.out.println("Nome: " + nome + ", Idade: " + idade);
        System.out.println("Salário: " + salario + ", Ativo: " + ativo + ", Letra: " + letra);
        System.out.println("Curso: " + curso + "\n");

        // ===== 2. Estruturas de controle =====
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }

        System.out.println("\nContagem com for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        int contador = 0;
        System.out.println("\nContagem com while:");
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        // ===== 3. Uso de métodos =====
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(5, 7);
        System.out.println("\nSoma (5 + 7) = " + resultado);

        // ===== 4. Classes e Objetos =====
        Pessoa p = new Pessoa("Isis", 21);
        p.apresentar();
    }
}

// ===== Classe auxiliar: Calculadora =====
class Calculadora {
    // Método público que soma dois números inteiros
    public int soma(int a, int b) {
        return a + b;
    }
}

// ===== Classe auxiliar: Pessoa =====
class Pessoa {
    String nome;
    int idade;

    // Construtor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método que imprime uma apresentação
    public void apresentar() {
        System.out.println("\nOi, eu sou " + nome + " e tenho " + idade + " anos.");
    }
}
