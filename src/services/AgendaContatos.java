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

    public void novoContatoComLoop(){
        while (true){
            novoContato();
            String resp = continuar("Continua? [S/N]");
            if (resp.equalsIgnoreCase("N")) {
                break;
            } else if (!resp.equalsIgnoreCase("S")) {
                System.out.println("ERRO! Resposta Invalida. Digite novamente!");
            }
        }
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

    public List<Contato> getListaContatos() {
        return listaContatos;
    }
}
