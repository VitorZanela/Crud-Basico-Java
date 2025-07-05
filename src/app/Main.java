package app;

import model.Layout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Layout layout = new Layout();

        //MENU PRINCIPAL
        while (true) {
            layout.menu(new String[]{"Cadastrar Contato","Ver Contatos", "Sair"});
            int opc = layout.leiaInt("Escolha uma opção: ");
            if (opc == 1) {
                System.out.println("Estamos na opção 1");
            } else if (opc == 2) {
                System.out.println("Estamos na opção 2");
            } else if (opc == 3) {
                break;
            } else {
                System.out.println("Opção Incorreta. Tente novamente!!");
            }
        }




    }
}
