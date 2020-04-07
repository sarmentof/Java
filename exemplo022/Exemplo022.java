package exemplo022;

import java.util.HashMap;

import java.util.Scanner;

public class Exemplo022 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    HashMap<Integer, String> produtos = new HashMap<>();

    int opcao;

    do {
      System.out.println("Digite 1 para incluir, 2 para consultar, 0 para sair");

      opcao = teclado.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Codigo do novo produto: ");
          int codigoN = teclado.nextInt();

          System.out.println("Nome do novo produto: ");
          String nomeN = teclado.next();

          produtos.put(codigoN, nomeN);

          break;

        case 2:
          System.out.println("Digite o codigo: ");
          int codigo = teclado.nextInt();

          String nome = produtos.get(codigo);

          if (nome != null) {
            System.out.println(nome);
          }

          break;

      }
    } while (opcao != 0);

  }

}