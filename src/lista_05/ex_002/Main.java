package lista_05.ex_002;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Contato joao = new Contato("João Silva", "(21) 99999-1111");
        Contato maria = new Contato("Maria Santos", "(21) 98888-2222");
        Contato pedro = new Contato("Pedro Oliveira", "(21) 97777-3333");

        agenda.adicionarContato(joao);
        agenda.adicionarContato(maria);
        agenda.adicionarContato(pedro);
        System.out.println("Total na agenda: 3 contatos");

        Contato resultado = agenda.procuraContatoPorNome("Maria Santos");
        System.out.println("Busca por Maria: " + (resultado != null ? resultado.getNumero() : "não achei"));

        Contato porNumero = agenda.procuraContatoPorNumero("(21) 97777-3333");
        System.out.println("Número do Pedro: " + (porNumero != null ? porNumero.getNome() : "não encontrei"));

        agenda.editarContato(joao, "João Jr", "(21) 90000-0000");
        System.out.println("João atualizado -> " + joao.getNome() + " / " + joao.getNumero());

        agenda.removerContato(maria);
        System.out.println("Maria ainda existe? " + (agenda.procuraContatoPorNome("Maria Santos") != null));

        System.out.println("Buscando alguém que não cadastrei: " + agenda.procuraContatoPorNome("Carlos Souza"));
    }
}