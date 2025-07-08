package model;

import java.util.Scanner;

public class Layout {

    public void linha(){
        System.out.println("======================");
    }

    public void cabecalho(String txt){
        linha();
        System.out.printf("    %s    \n",txt);
        linha();
    }

    public void menu(String[] lista){
        for (int i = 0; i < lista.length; i++) {
            System.out.println(i+1 +" - "+lista[i]);
        }
        linha();

    }

    public int leiaInt(String txt){
        Scanner entrada = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print(txt);
            try {
                n = Integer.parseInt(entrada.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Opção Invalida. Digite novamente!");
            }
        }
    }

    public String continuar(String txt){
        Scanner entrada = new Scanner(System.in);
        String resp;
        while (true){
            System.out.println(txt);
            try {
                resp = entrada.nextLine();
                return resp;
            } catch (RuntimeException e){
                System.out.println("ERRO! Resposta Invalida. Digite novamente!");
            }
        }
    }



}
