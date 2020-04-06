package exemplo004;

import java.util.Scanner;

public class Exemplo004 {
  public static void main(String[] args) {

    // Objeto Scanner possibilita receber valores, System.in indica que e' do
    // teclado
    Scanner s1 = new Scanner(System.in);

    System.out.println("DIGITE UM NUMERO:");

    // nextInt() e' o metodo que captura o proximo inteiro
    int x = s1.nextInt();

    if (x % 2 == 0)
      System.out.println("O NUMERO E' PAR!");
    else
      System.out.println("O NUMERO E' IMPAR!");
  }
}
