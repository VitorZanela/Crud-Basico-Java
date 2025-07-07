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
            layout.menu(new String[]{"Cadastrar Contato","Ver Contatos", "Sair"});
            int opc = layout.leiaInt("Escolha uma opção: ");
            if (opc == 1) {

                while(true){
                    layout.cabecalho("NOVO CONTATO");

                    Contato contato = new Contato();

                    System.out.print("Nome: ");
                    contato.setNome(entrada.nextLine());
                    System.out.print("Telefone: ");
                    contato.setTelefone(entrada.nextLine());
                    System.out.print("Email: ");
                    contato.setEmail(entrada.nextLine());

                    funcCont.adicionarContato(contato);
                    System.out.println("--> Adicionado com Sucesso! <--");

                    System.out.println("Continua? [S/N]");
                    String resp = entrada.nextLine();
                    if (resp.equalsIgnoreCase("S")) {

                    } else if (resp.equalsIgnoreCase("N")) {
                        break;
                    }else {
                        System.out.println("Opção invalida! Tente novamente");
                    }
                }

            } else if (opc == 2) {
                layout.linha();
                funcCont.listarContatos();
            } else if (opc == 3) {
                break;
            } else {
                System.out.println("Opção Incorreta. Tente novamente!!");
            }
        }




    }
}
