package services;

import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {
    private List<Contato> listaContatos = new ArrayList<>();

    public void adicionarContato(Contato novoContato){
        listaContatos.add(novoContato);
    }

    public void listarContatos(){
        for (Contato contato : listaContatos){
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEmail());
            System.out.println("----------------");
        }
    }

}
