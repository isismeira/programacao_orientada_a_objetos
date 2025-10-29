package lista_05.ex_002;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato procuraContatoPorNome(String nome){
        for (Contato contato: contatos){
            if (contato.getNome().equals(nome))
                return contato;
        }
        return null;
    }

    public Contato procuraContatoPorNumero(String numero){
        for (Contato contato: contatos){
            if (contato.getNumero().equals(numero))
                return contato;
        }
        return null;
    }
    
    public void editarContato(Contato contato, String nome, String numero) {
        if (contatos.contains(contato)) {
            contato.setNome(nome);
            contato.setNumero(numero);
        }
    }
}
