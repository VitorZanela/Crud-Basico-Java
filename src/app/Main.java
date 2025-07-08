package app;

import model.Layout;
import services.AgendaContatos;
import services.Contato;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AgendaContatos funcCont = new AgendaContatos();
        Layout layout = new Layout();

        while (true) {
            layout.cabecalho("MENU PRINCIPAL");
            layout.menu(new String[]{"Cadastrar Contato","Ver Contatos", "Sair"});
            int opc = layout.leiaInt("Escolha uma opção: ");
            if (opc == 1) {
                funcCont.novoContatoComLoop();
            } else if (opc == 2) {
                layout.linha();
                if (funcCont.getListaContatos().isEmpty()){
                    System.out.println("Sem contatos cadastrados!");
                    layout.cabecalho("INCLUSÃO CONTATOS");
                    layout.menu(new String[]{"Cadastrar Contato", "Sair"});
                    int opcEmpty = layout.leiaInt("Escolha uma opção: ");
                    if (opcEmpty == 1) {
                        funcCont.novoContatoComLoop();
                    } else if (opcEmpty == 2){
                        break;
                    } else {
                        System.out.println("ERRO! Opção Invalida. Digite novamente!");
                    }
                } else {
                    funcCont.listarContatos();
                    layout.cabecalho("EDITAR CONTATOS");
                    layout.menu(new String[]{"Cadastrar Contato", "Ver Contatos", "Atualizar Contato","Remover Contato", "Sair"});
                }
                int resp = layout.leiaInt("Escolha uma opção: ");
                if (resp == 1){
                    funcCont.novoContatoComLoop();
                } else if (resp == 2) {
                    System.out.println("OPÇÃO 2");
                }


            } else if (opc == 3) {
                break;
            } else {
                System.out.println("ERRO! Opção Invalida. Digite novamente!");
            }
        }




    }
}
