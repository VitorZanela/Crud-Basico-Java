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
            if (listaContatos.size() == 1) {
                System.out.println("Nome: " +contato.getNome());
                System.out.println("Telefone: " +contato.getTelefone());
                System.out.println("E-mail: " +contato.getEmail());
            } else {
                System.out.println("Nome: " +contato.getNome());
                System.out.println("Telefone: " +contato.getTelefone());
                System.out.println("E-mail: " +contato.getEmail());
                System.out.println("----------------");
            }
        }
    }

    public void consultaContato(){
        int i = 1;
        System.out.println("ID - NOME");
        linha();
        for (Contato contato : listaContatos) {
            System.out.println(i + " - " + contato.getNome());
            i++;
        }
    }

    public void listarInfoContatos(int indexInfo){
        Scanner entrada = new Scanner(System.in);
        cabecalho("ESCOLHA O DADO");
        System.out.println("1 - "+listaContatos.get(indexInfo).getNome());
        System.out.println("2 - "+listaContatos.get(indexInfo).getTelefone());
        System.out.println("3 - "+listaContatos.get(indexInfo).getEmail());
        while (true) {
            int edicao = leiaInt("Escolha uma opção: ");
            if (edicao == 1) {
                System.out.println("Digite o novo nome: ");
                listaContatos.get(indexInfo).setNome(entrada.nextLine());
                break;
            } else if (edicao == 2) {
                System.out.println("Digite o novo telefone: ");
                listaContatos.get(indexInfo).setTelefone(entrada.nextLine());
                break;
            } else if (edicao == 3) {
                System.out.println("Digite o novo email: ");
                listaContatos.get(indexInfo).setEmail(entrada.nextLine());
                break;
            } else {
                System.out.println("ERRO! Opção Invalida. Digite novamente!");
            }
        }
    }

    public void exclusaoContato(int contato){
        listaContatos.remove(contato - 1);
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }
}
