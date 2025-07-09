package services;

import model.Layout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaContatos extends Layout {
    private List<Contato> listaContatos = new ArrayList<>();

    public void novoContato() {
        Scanner entrada = new Scanner(System.in);
        Contato contato = new Contato();

        cabecalho("NOVO CONTATO");
        System.out.print("Nome: ");
        contato.setNome(entrada.nextLine());
        System.out.print("Telefone: ");
        contato.setTelefone(entrada.nextLine());
        System.out.print("Email: ");
        contato.setEmail(entrada.nextLine());

        adicionarContato(contato);
        System.out.println("--> Adicionado com Sucesso! <--");

    }


    public void adicionarContato(Contato novoContato) {

        listaContatos.add(novoContato);
    }

    public void listarContatos() {
        for (Contato contato : listaContatos) {
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEmail());
            System.out.println("----------------");
        }
    }

    public void consultaContato(){
        int i = 1;
        System.out.println("ID - NOME");
        linha();
        for (Contato contato : listaContatos) {
            System.out.println(i + " - " + contato.getNome()+" - "+contato.getEmail()+" - "+contato.getTelefone());
            i++;
        }
    }

    public void exclusaoContato(int contato){
            int index = contato - 1;
            listaContatos.remove(index);
    }

    public List<Contato> getListaContatos() {

        return listaContatos;
    }
}
