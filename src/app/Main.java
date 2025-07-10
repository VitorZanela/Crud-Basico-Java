package app;

import model.Layout;
import services.AgendaContatos;


public class Main {
    public static void main(String[] args) {
        AgendaContatos funcCont = new AgendaContatos();
        Layout layout = new Layout();

        while (true) {
            layout.cabecalho("MENU PRINCIPAL");
            layout.menu(new String[]{"Cadastrar Contato","Ver Contatos", "Sair"});
            int opc = layout.leiaInt("Escolha uma opção: ");
            if (opc == 1) {
                funcCont.novoContato();
            } else if (opc == 2) {
                layout.linha();
                if (funcCont.getListaContatos().isEmpty()){
                    System.out.println("Sem contatos cadastrados!");
                    layout.cabecalho("INCLUSÃO CONTATOS");
                    layout.menu(new String[]{"Cadastrar Contato", "Sair"});
                    int opcEmpty = layout.leiaInt("Escolha uma opção: ");
                    if (opcEmpty == 1) {
                        funcCont.novoContato();
                    } else if (opcEmpty == 2){
                        break;
                    } else {
                        System.out.println("ERRO! Opção Invalida. Digite novamente!");
                    }
                } else {
                    funcCont.listarContatos();
                    layout.cabecalho("EDITAR CONTATOS");
                    layout.menu(new String[]{"Cadastrar Contato", "Ver Contatos", "Atualizar Contato","Remover Contato", "Sair"});
                    int resp = layout.leiaInt("Escolha uma opção: ");
                    if (resp == 1){
                        funcCont.novoContato();
                    } else if (resp == 2) {
                        funcCont.listarContatos();
                    } else if (resp == 3){
                        layout.cabecalho("ESCOLHER CONTATO");
                        funcCont.consultaContato();
                        while (true) {
                            int escolha = layout.leiaInt("Escolha um contato: ");
                            if (escolha > funcCont.getListaContatos().size()) {
                                System.out.println("Contato incorreto! Tente novamente!");
                            }else if (escolha < 1){
                                System.out.println("ERRO! Opção Invalida. Digite novamente!");
                            } else {
                                funcCont.listarInfoContatos(escolha-1);
                                break;
                            }
                        }
                    } else if (resp == 4){
                        layout.cabecalho("ESCOLHER CONTATO");
                        funcCont.consultaContato();
                        while (true) {
                            int escolha = layout.leiaInt("Escolha um contato: ");
                            if (escolha > funcCont.getListaContatos().size()) {
                                System.out.println("Contato incorreto! Tente novamente!");
                            }else if (escolha < 1){
                                System.out.println("ERRO! Opção Invalida. Digite novamente!");
                            } else {
                                funcCont.exclusaoContato(escolha);
                                break;
                            }
                        }
                    } else if (resp == 5){
                        break;
                    } else {
                        System.out.println("ERRO! Opção Invalida. Digite novamente!");
                    }
                }
            } else if (opc == 3) {
                break;
            } else {
                System.out.println("ERRO! Opção Invalida. Digite novamente!");
            }
        }
    }
}
