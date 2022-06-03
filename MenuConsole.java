package com.mycompany.supermercado;


public class MenuConsole {
 
    public static void main(String[] args) {
        int swValue;
        System.out.println("Menu de Opções");
        System.out.println("Opções:");
        System.out.println(" 1. Gerenciar Caixa");
        System.out.println(" 2. Gerenciar Produtos");
        System.out.println(" 3. Gerenciar Vendas");
        swValue = Keyin.inInt("Escolha um item: ");

        // Switch construct
        switch (swValue) {
        case 1:
          System.out.println("Gerenciar Caixa selecionado!");
          break;
        case 2:
          System.out.println("Gerenciar Produtos selecionada!");
          break;
        case 3:
          System.out.println("Gerenciar Vendas selecionado!");
          break;
        default:
          System.out.println("Seleção Inválida");
          break;
        }
    }
}
   
